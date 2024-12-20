package CreatedVisitor;

import java.util.stream.Collectors;

import SymbolTable.Type;
import SymbolTable.FunctionSymbol;
import SymbolTable.ProcedureSymbol;
import org.antlr.v4.runtime.tree.TerminalNode;
import Parser.*;
import SymbolTable.ScopeManager;
import SymbolTable.Symbol;
public class MiniPascalVisitor extends MiniPascalBaseVisitor<String> {
    private final ScopeManager scopeManager;
    private int actualScope = 0;
    private boolean activeProcesooFuncion = false;

    public MiniPascalVisitor(ScopeManager scopeManager) {
        this.scopeManager = scopeManager;
    }
    // Llama a visitar el encabezado y el bloque del programa
    @Override
    public String visitPrograma(MiniPascalParser.ProgramaContext ctx) {
        String Header = "----------------PROGRAM HEADER:-----------------------------\n";
        String encabezado = visitEncabezado(ctx.encabezado());
        String bloque = visitBloque(ctx.bloque());
        String Block = "----------------PROGRAM BLOCK:------------------------------\n";
        return Header + encabezado + "\n" + Block + bloque + ".";
    }
    // Visita el encabezado del programa (identificador y parámetros opcionales)
    @Override
    public String visitEncabezado(MiniPascalParser.EncabezadoContext ctx) {

        String programName = ctx.IDENTIFIER().getText();
        String parametros = "";
        if (ctx.listaidentificadores() != null) {
            parametros = visitListaidentificadores(ctx.listaidentificadores());
        }
        return "program " + programName + (parametros.isEmpty() ? "" : "(" + parametros + ")");
    }
    // Visita las secciones de declaraciones y el bloque de instrucciones
    @Override
    public String visitBloque(MiniPascalParser.BloqueContext ctx) {

        StringBuilder resultado = new StringBuilder();
        if (ctx.secciondeclaracionconstante() != null){
            for (MiniPascalParser.SecciondeclaracionconstanteContext secConst : ctx.secciondeclaracionconstante()) {
                resultado.append(visitSecciondeclaracionconstante(secConst)).append("\n");
            }
        }
        if (ctx.secciondeclaracionvariable() != null){
            for (MiniPascalParser.SecciondeclaracionvariableContext secVar : ctx.secciondeclaracionvariable()) {
                resultado.append(visitSecciondeclaracionvariable(secVar)).append("\n");
            }
        }
        if (ctx.secciondeclaracionprocesoofuncion() != null){
            for (MiniPascalParser.SecciondeclaracionprocesoofuncionContext secProcFunc : ctx.secciondeclaracionprocesoofuncion()) {
                resultado.append(visitSecciondeclaracionprocesoofuncion(secProcFunc)).append("\n");
            }
        }

        if (ctx.bloqueinstruccion() != null){
            String bloqueInstruccion = "\n----------------PROGRAM INSTRUCTIONS:------------------------\n";

            resultado.append(bloqueInstruccion);
            resultado.append(visitBloqueinstruccion(ctx.bloqueinstruccion()));

        }
        return resultado.toString();
    }

    // Procesa una lista de identificadores separados por comas
    @Override
    public String visitListaidentificadores(MiniPascalParser.ListaidentificadoresContext ctx) {

        return ctx.IDENTIFIER().stream().map(TerminalNode::getText).collect(Collectors.joining(", "));
    }

    // Visita una sección de declaración de variables
    @Override
    public String visitSecciondeclaracionvariable(MiniPascalParser.SecciondeclaracionvariableContext ctx) {

        StringBuilder resultado = new StringBuilder("var ");
        for (MiniPascalParser.DeclaracionvariableContext declVar : ctx.declaracionvariable()) {
            resultado.append(visitDeclaracionvariable(declVar)).append(";\n");
        }
        return resultado.toString();
    }

    // Visita una declaración de variable (lista de identificadores y tipo)
    @Override
    public String visitDeclaracionvariable(MiniPascalParser.DeclaracionvariableContext ctx) {

        String identificadores = visitListaidentificadores(ctx.listaidentificadores());
        String tipo = visitTipo(ctx.tipo());
        Type variableType;
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        //Apartado para la tabla de simbolos
        if (tipo.equals("INTEGER") || tipo.equals("integer")) {

            variableType = new Type(Type.BasicType.INTEGER);
        } else if (tipo.equals("BOOLEAN") || tipo.equals("boolean")) {
            variableType = new Type(Type.BasicType.BOOLEAN);
        } else if (tipo.equals("STRING") || tipo.equals("string")) {
            variableType = new Type(Type.BasicType.STRING);
        } else if (tipo.equals("CHAR") || tipo.equals("char")) {
            variableType = new Type(Type.BasicType.CHAR);
        } else {
            variableType = new Type(Type.BasicType.ARRAY);
        }

        for (String identifier : identificadores.split(", ")) {
            scopeManager.getSymbolTable().setLine(line);
            scopeManager.getSymbolTable().setColumn(column);
            scopeManager.define(identifier, new Symbol(identifier, variableType));
        }

        return identificadores + " : " + tipo;
    }
    // Visita el bloque de instrucciones
    @Override
    public String visitBloqueinstruccion(MiniPascalParser.BloqueinstruccionContext ctx) {
        StringBuilder resultado = new StringBuilder("begin\n");
        resultado.append("\t");
        resultado.append(visitInstrucciones(ctx.instrucciones()));
        resultado.append("end;\n");
        return resultado.toString();
    }

    // Visita la lista de instrucciones
    @Override
    public String visitInstrucciones(MiniPascalParser.InstruccionesContext ctx) {
        StringBuilder resultado = new StringBuilder();

       if (ctx.instruccion() != null){
           for (MiniPascalParser.InstruccionContext instr : ctx.instruccion()) {
               visitInstruccion(instr);
               resultado.append(instr.getParent().getParent().getClass().getTypeName() == "Parser.MiniPascalParser$BloqueinstruccionContext" ? visitInstruccion(instr) + "\n\t": visitInstruccion(instr));
           }
       } else {
           resultado.append("");
       }
       return resultado.toString();
    }

    // Visita una instrucción específica
    @Override
    public String visitInstruccion(MiniPascalParser.InstruccionContext ctx) {

        if (ctx.tipoinstruccion() != null) {
            return visitTipoinstruccion(ctx.tipoinstruccion());
        }
        return "";
    }

    // Visita una instrucción simple o estructurada
    @Override
    public String visitTipoinstruccion(MiniPascalParser.TipoinstruccionContext ctx) {

        if (ctx.instruccionsimple() != null) {
            return visitInstruccionsimple(ctx.instruccionsimple());
        } else if (ctx.instruccionestructurada() != null) {
            return visitInstruccionestructurada(ctx.instruccionestructurada());
        } else{
            return "";
        }

    }

    // Visita una instrucción simple (asignación, procedimiento, o vacía)
    @Override
    public String visitInstruccionsimple(MiniPascalParser.InstruccionsimpleContext ctx) {

        if (ctx.instruccionasignacion() != null) {
            return visitInstruccionasignacion(ctx.instruccionasignacion());
        } else if (ctx.instruccionprocedimiento() != null) {
            return visitInstruccionprocedimiento(ctx.instruccionprocedimiento());
        } else if (ctx.instruccionvacia() != null){
            return visitInstruccionvacia(ctx.instruccionvacia());
        }
        else {
            return "";
        }
    }
    // Visita una instrucción de asignación
    @Override
    public String visitInstruccionasignacion(MiniPascalParser.InstruccionasignacionContext ctx) {

        String variable = visitVariable(ctx.variable());
        String expresion = visitExpresion(ctx.expresion());
        String noSpaceExpresion = expresion.replaceAll("\\s+","");
        String operationType = "";
        if (noSpaceExpresion.equalsIgnoreCase("true") || noSpaceExpresion.equalsIgnoreCase("false") || noSpaceExpresion.toLowerCase().contains("or") ||
                noSpaceExpresion.toLowerCase().contains("and") || noSpaceExpresion.toLowerCase().contains("not") ) {
            operationType = "boolean";
        } else{
            operationType = "integer";
        }
        //quitar espacios
        String noSpaceVariable = variable.replaceAll("\\s+","");
        Symbol symbol = scopeManager.getSymbolTable().getSymbol(noSpaceVariable);
        Symbol symbol2 = scopeManager.getSymbolTable().getSymbolbyIdentifier(noSpaceVariable);
        scopeManager.getSymbolTable().setLine(ctx.start.getLine());
        scopeManager.getSymbolTable().setColumn(ctx.start.getCharPositionInLine());
        if (symbol != null) {
            //verificar si esta instancia
            scopeManager.getSymbolTable().validateSymbolExist(symbol);
            scopeManager.getSymbolTable().verifyOperationType(symbol, operationType);
        }
        if (symbol2 != null) {
            scopeManager.getSymbolTable().setSymbolValue(symbol2, expresion);
        }

        if(activeProcesooFuncion){
            scopeManager.getSymbolTable().setLine(ctx.start.getLine());
            scopeManager.getSymbolTable().setColumn(ctx.start.getCharPositionInLine());
            if (ctx.expresion().expresionsimple().operadoraditivo() != null){
                if (symbol2 instanceof FunctionSymbol){
                    if(((FunctionSymbol) symbol2).getReturnType().toString() != "integer") {
                        scopeManager.getSymbolTable().badOperationType();
                    }
                }
            }

        }

        return variable + " := " + expresion + ";";
    }

    // Visita una expresión
    @Override
    public String visitExpresion(MiniPascalParser.ExpresionContext ctx) {
        StringBuilder resultado = new StringBuilder();
        if (ctx.expresionsimple() != null) {
            resultado.append(visitExpresionsimple(ctx.expresionsimple()));
        }

        if (ctx.operadorrelacional() != null){
            resultado.append(visitOperadorrelacional(ctx.operadorrelacional()) + " " + visitExpresion(ctx.expresion()));
        }
        return resultado.toString();
    }

    @Override
    public String visitOperadorrelacional(MiniPascalParser.OperadorrelacionalContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitExpresionsimple(MiniPascalParser.ExpresionsimpleContext ctx) {
        return (ctx.termino() != null ? visitTermino(ctx.termino()) : "") + (ctx.operadoraditivo() != null ? visitOperadoraditivo(ctx.operadoraditivo()) : "")
                + (ctx.expresionsimple() != null ? visitExpresionsimple(ctx.expresionsimple()): "") ;
    }
    // Visita un término

    @Override
    public String visitTermino(MiniPascalParser.TerminoContext ctx) {

        return visitSignofactor(ctx.signofactor()) + (ctx.operadormultiplicativo() != null ? visitOperadormultiplicativo(ctx.operadormultiplicativo()) : "")
                + (ctx.termino() != null ? visitTermino(ctx.termino()) : "");
    }
    @Override
    public String visitSignofactor(MiniPascalParser.SignofactorContext ctx){
        return (ctx.PLUS() != null ? "+" : "") + (ctx.MINUS() != null ? "-" : "") + (ctx.factor() != null ? visitFactor(ctx.factor()) : "");
    }

    @Override
    public String visitFactor(MiniPascalParser.FactorContext ctx) {
        return (ctx.variable() != null ? visitVariable(ctx.variable()) : "") + (ctx.expresion() != null ? "("+ visitExpresion(ctx.expresion()) + ")" : "")
                + (ctx.designarfuncion() != null ? visitDesignarfuncion(ctx.designarfuncion()) : "") + (ctx.constante() != null ? visitConstante(ctx.constante()) : "")
                + (ctx.factor() != null ? "NOT " + visitFactor(ctx.factor()) : "") + (ctx.valorbooleano() != null ? visitValorbooleano(ctx.valorbooleano()) : "");
    }

    @Override
    public String visitOperadormultiplicativo(MiniPascalParser.OperadormultiplicativoContext ctx) {
        return ctx.getText() + " ";
    }
    @Override
    public String visitVariable(MiniPascalParser.VariableContext ctx) {
        String line = String.valueOf(ctx.start.getLine());
        StringBuilder resultado = new StringBuilder(ctx.IDENTIFIER(0).getText() + " ");

        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            resultado.append(".").append(ctx.IDENTIFIER(i).getText());
        }

        if (ctx.LBRACKET() != null) {
            for (MiniPascalParser.ExpresionContext expr : ctx.expresion()) {
                resultado.append("[").append(visitExpresion(expr)).append("]");
            }
        }
        String noSpaceVariable = resultado.toString().replaceAll("\\s+","");
        Symbol symbol = scopeManager.getSymbolTable().getSymbolbyIdentifier(noSpaceVariable);
        if (symbol != null) {
            scopeManager.getSymbolTable().setLine(ctx.start.getLine());
            scopeManager.getSymbolTable().setColumn(ctx.start.getCharPositionInLine());
            scopeManager.getSymbolTable().CheckSymbolScopeLevel(symbol, actualScope);
        }

        return resultado.toString();
    }

    // Visita un tipo de dato
    @Override
    public String visitTipo(MiniPascalParser.TipoContext ctx) {
        if (ctx.tipoarreglo() != null) {
            return visitTipoarreglo(ctx.tipoarreglo());
        } else if (ctx.tiposimple() != null) {
            return visitTiposimple(ctx.tiposimple());
        } else {
            return "Error";
        }
    }
    @Override
    public String visitTipoarreglo(MiniPascalParser.TipoarregloContext ctx) {
        StringBuilder resultado = new StringBuilder();

        if (ctx.LBRACKETP() != null){
            resultado.append(ctx.ARRAY().getText() + ctx.LBRACKETP().getText() + visitTipolista(ctx.tipolista()) + ctx.RBRACKETP().getText() + " " + ctx.OF().getText() + " " + visitTipo(ctx.tipo()));
        } else if (ctx.LBRACKET() != null) {
            resultado.append(ctx.ARRAY().getText() + ctx.LBRACKET().getText() + visitTipolista(ctx.tipolista()) + ctx.RBRACKET().getText() + " " + ctx.OF().getText() + " " + visitTipo(ctx.tipo()));
        } else {
            resultado.append(ctx.ARRAY().getText() + ctx.LBRACKETP().getText() + visitTipolista(ctx.tipolista()) + ctx.RBRACKETP().getText() + " " + ctx.OF().getText() + " " + visitTipo(ctx.tipo()));

        }
        return resultado.toString();

    }
    @Override
    public String visitTiposimple(MiniPascalParser.TiposimpleContext ctx) {
        if (ctx.tipoidentificador() != null) {
            return visitTipoidentificador(ctx.tipoidentificador());
        } else if (ctx.tipoescalar() != null) {
            return visitTipoescalar(ctx.tipoescalar());
        } else if (ctx.tipocadena() != null) {
            return visitTipocadena(ctx.tipocadena());
        } else {
            return "Error";
        }
    }
    @Override
    public String visitTipoidentificador(MiniPascalParser.TipoidentificadorContext ctx) {
        return ctx.getText();
    }


    @Override
    public String visitTipocadena(MiniPascalParser.TipocadenaContext ctx) {
        return "string[" + ctx.getText().substring(ctx.getText().indexOf('[') + 1, ctx.getText().indexOf(']')) + "]";
    }


    @Override
    public String visitTiposubrango(MiniPascalParser.TiposubrangoContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitSecciondeclaracionprocesoofuncion(MiniPascalParser.SecciondeclaracionprocesoofuncionContext ctx) {
        activeProcesooFuncion = true;
        StringBuilder resultado = new StringBuilder();
        if (ctx.declaracionprocesoofuncion() != null){
            if (ctx.declaracionprocesoofuncion().declaracionfuncion() != null){
                String declaracionFuncion = "----------------FUNCTION DECLARATION:------------------------\n";
                resultado.append(declaracionFuncion);
                String funcion = visitDeclaracionfuncion(ctx.declaracionprocesoofuncion().declaracionfuncion()) + "\n";
                resultado.append(funcion);
                // Salir del nivel de scope (1) para funciones locales de las funciones o procesos
                scopeManager.exitScope();
                actualScope = 0;
            }
            if (ctx.declaracionprocesoofuncion().declaracionproceso() != null){
                String declaracionProcedimiento = "----------------PROCEDURE DECLARATION:------------------------\n";
                resultado.append(declaracionProcedimiento);
                String procedimiento = visitDeclaracionproceso(ctx.declaracionprocesoofuncion().declaracionproceso()) + "\n";
                resultado.append(procedimiento);
                // Salir del nivel de scope (1) para funciones locales de las funciones o procesos
                scopeManager.exitScope();
                actualScope = 0;
            }
        }
        activeProcesooFuncion = false;
        return resultado.toString();
    }

    @Override
    public String visitDeclaracionfuncion(MiniPascalParser.DeclaracionfuncionContext ctx) {
        /* ================== Tabla de Simbolos ================== */
        String identificador = ctx.IDENTIFIER().getText();
        Type returnType;
        if (visitTipoidentificador(ctx.tipoidentificador()).equalsIgnoreCase("integer")) {
            returnType = new Type(Type.BasicType.INTEGER);
        } else if (visitTipoidentificador(ctx.tipoidentificador()).equalsIgnoreCase("boolean")) {
            returnType = new Type(Type.BasicType.BOOLEAN);
        } else if (visitTipoidentificador(ctx.tipoidentificador()).equalsIgnoreCase("string") ) {
            returnType = new Type(Type.BasicType.STRING);
        } else {
            returnType = new Type(Type.BasicType.CHAR);
        }
        FunctionSymbol functionSymbol = new FunctionSymbol(identificador,returnType);
        scopeManager.define(identificador, functionSymbol);
        //Aumentar el nivel de scope (1) para funciones locales de las funciones o procesos
        scopeManager.enterScope();
        actualScope = 1;
        return ctx.FUNCTION().getText() + ctx.IDENTIFIER().getText() + ctx.PARL().getText() + (ctx.listaformalparametros() != null ? visitListaformalparametros(ctx.listaformalparametros()) : "") + ctx.PARR().getText()
                + ctx.COLON().getText() + visitTipoidentificador(ctx.tipoidentificador()) + ctx.SEMICOLON().getText() + (ctx.bloque() != null ? visitBloque(ctx.bloque()) : "");

    }

    @Override
    public String visitDeclaracionproceso(MiniPascalParser.DeclaracionprocesoContext ctx) {
        /* ================== Tabla de Simbolos ================== */
        String identificador = ctx.IDENTIFIER().getText();

        ProcedureSymbol procedureSymbol = new ProcedureSymbol(identificador);
        scopeManager.define(identificador, procedureSymbol);
        //Aumentar el nivel de scope (1) para funciones locales de las funciones o procesos
        scopeManager.enterScope();
        actualScope = 1;
        return ctx.PROCEDURE().getText() + " " +  ctx.IDENTIFIER().getText() + (ctx.PARL() != null ? ctx.PARL().getText() : "") + (ctx.listaformalparametros() != null ? visitListaformalparametros(ctx.listaformalparametros()) : "") + (ctx.PARR() != null ? ctx.PARR().getText() : "")
                + ctx.SEMICOLON().getText() + visitBloque(ctx.bloque());
    }
    @Override
    public String visitListaformalparametros(MiniPascalParser.ListaformalparametrosContext ctx) {
        StringBuilder resultado = new StringBuilder();
        if (ctx.seccionformalparametros() != null){
            for (MiniPascalParser.SeccionformalparametrosContext secParam : ctx.seccionformalparametros()){
                resultado.append(visitSeccionformalparametros(secParam));
            }
        }
        return resultado.toString();
    }

    @Override
    public String visitSeccionformalparametros(MiniPascalParser.SeccionformalparametrosContext ctx) {
        StringBuilder resultado = new StringBuilder();
        if (ctx.VAR() != null){
            resultado.append(ctx.VAR().getText() + " ");
        } else if (ctx.FUNCTION() != null){
            resultado.append(ctx.FUNCTION().getText() + " ");
        } else if (ctx.PROCEDURE() != null){
            resultado.append(ctx.PROCEDURE().getText() + " ");
        }
        if (ctx.grupoparametros() != null){
            resultado.append(visitGrupoparametros(ctx.grupoparametros()));
        }
        return resultado.toString();
    }

    @Override
    public String visitGrupoparametros(MiniPascalParser.GrupoparametrosContext ctx) {
        return visitListaidentificadores(ctx.listaidentificadores()) + ctx.COLON().getText() + (ctx.tipoidentificador() != null ? visitTipoidentificador(ctx.tipoidentificador()) : "") + (ctx.tipoarreglo() != null ? visitTipoarreglo(ctx.tipoarreglo()) : "");
    }

    @Override
    public String visitOperadoraditivo(MiniPascalParser.OperadoraditivoContext ctx) {
        return ctx.getText() + " ";
    }

    @Override
    public String visitInstruccionvacia(MiniPascalParser.InstruccionvaciaContext ctx) {
        return "";
    }

    @Override
    public String visitInstruccionestructurada(MiniPascalParser.InstruccionestructuradaContext ctx){
        StringBuilder resultado = new StringBuilder();
        if (ctx.bloqueinstruccion() != null){
            resultado.append(visitBloqueinstruccion(ctx.bloqueinstruccion()));
        } else if(ctx.estructuraif() != null){
            resultado.append(visitEstructuraif(ctx.estructuraif()));
        } else if(ctx.estructurarepetitiva() != null){
            resultado.append(visitEstructurarepetitiva(ctx.estructurarepetitiva()));
        }
        return resultado.toString();
    }

    @Override
    public String visitEstructuraif(MiniPascalParser.EstructuraifContext ctx) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(ctx.IF().getText());
        resultado.append(" ");
        if (ctx.expresion().expresion() != null){

            String expresion1 = ctx.expresion().expresion().getText();
            String expresion2 = ctx.expresion().expresionsimple().getText();
            //quitar parentesis () si es que los tiene

            scopeManager.getSymbolTable().setLine(ctx.start.getLine());
            scopeManager.getSymbolTable().setColumn(ctx.start.getCharPositionInLine());
            Symbol symbol = scopeManager.getSymbolTable().getSymbolbyIdentifier(expresion1);
            Symbol symbol2 = scopeManager.getSymbolTable().getSymbolbyIdentifier(expresion2);
            if (symbol != null && symbol2 != null) {
                if (symbol.getType() != symbol2.getType()) {
                    scopeManager.getSymbolTable().badOperationType();
                }
            }
        } else if (ctx.expresion().expresionsimple().termino().signofactor().factor().PARL() != null   ){
            String expresion1 = ctx.expresion().expresionsimple().termino().signofactor().factor().expresion().expresionsimple().getText();
            String expresion2 = ctx.expresion().expresionsimple().termino().signofactor().factor().expresion().expresion().getText();
            scopeManager.getSymbolTable().setLine(ctx.start.getLine());
            scopeManager.getSymbolTable().setColumn(ctx.start.getCharPositionInLine());
            Symbol symbol = scopeManager.getSymbolTable().getSymbolbyIdentifier(expresion1);
            Symbol symbol2 = scopeManager.getSymbolTable().getSymbolbyIdentifier(expresion2);
            if (symbol != null && symbol2 != null) {
                if (symbol.getType() != symbol2.getType()) {
                    scopeManager.getSymbolTable().badOperationType();
                }
            }
        }
        resultado.append(visitExpresion(ctx.expresion()));
        resultado.append(" ");
        resultado.append(ctx.THEN().getText());
        resultado.append("\n");
        resultado.append(visitInstruccion(ctx.instruccion(0)));
        if (ctx.ELSE() != null){
            resultado.append("\n");
            resultado.append("\t");
            resultado.append(ctx.ELSE().getText());
            resultado.append("\n");
            resultado.append("\t");
            resultado.append(visitInstruccion(ctx.instruccion(1)));
        }
        return resultado.toString();
    }


    @Override
    public String visitConstante(MiniPascalParser.ConstanteContext ctx) {
        if (ctx.signo() != null && ctx.NUM() != null) {
            return visitSigno(ctx.signo()) + ctx.NUM().getText() + " ";
        } else if (ctx.signo() != null && ctx.IDENTIFIER() != null){
            return visitSigno(ctx.signo()) + ctx.IDENTIFIER().getText()+ " ";
        } else if (ctx.length() != null){
            return visitLength(ctx.length()) + " ";
        } else if (ctx.LSTRING() != null){
            return ctx.LSTRING().getText() + " ";
        } else {
            return ctx.NUM().getText() + " ";
        }

    }
    @Override
    public String visitSigno(MiniPascalParser.SignoContext ctx) {
        return ctx.getText() + " ";
    }
    @Override
    public String visitLength(MiniPascalParser.LengthContext ctx) {
        return ctx.LENGTH().getText() + " " + (ctx.PARL() != null ? ctx.PARL().getText() : "" ) + (ctx.variable() != null ? visitVariable(ctx.variable()) : "") + (ctx.PARR() != null ? ctx.PARR().getText() : "" ) + " ";
    }

    @Override
    public String visitValorbooleano(MiniPascalParser.ValorbooleanoContext ctx) {
        return ctx.getText() + " ";
    }
    @Override
    public String visitDesignarfuncion(MiniPascalParser.DesignarfuncionContext ctx) {
         return ctx.IDENTIFIER().getText() + " " + ctx.PARL().getText() + (ctx.listaparametros() != null ? visitListaparametros(ctx.listaparametros()) : "") + ctx.PARR().getText();
    }
    @Override
    public String visitListaparametros(MiniPascalParser.ListaparametrosContext ctx) {
          StringBuilder resultado = new StringBuilder();
          if (ctx.parametroactual() != null){
                for (MiniPascalParser.ParametroactualContext param : ctx.parametroactual()){
                    resultado.append(visitParametroactual(param));
                }
          }
          return resultado.toString();
    }

    @Override
    public String visitParametroactual(MiniPascalParser.ParametroactualContext ctx) {
        StringBuilder resultado = new StringBuilder();
        if (ctx.expresion() != null){
            resultado.append(visitExpresion(ctx.expresion()));
        }
        for (MiniPascalParser.AnchoparametroContext ancho : ctx.anchoparametro()){
            resultado.append(visitAnchoparametro(ancho));
        }
        return resultado.toString();
    }

    @Override
    public String visitAnchoparametro(MiniPascalParser.AnchoparametroContext ctx) {
        return ctx.COLON() + " " + visitExpresion(ctx.expresion());
    }

    @Override
    public String visitInstruccionprocedimiento(MiniPascalParser.InstruccionprocedimientoContext ctx) {
        return ctx.IDENTIFIER().getText() + (ctx.PARL() != null ? ctx.PARL().getText() : "") + (ctx.listaparametros() != null ? visitListaparametros(ctx.listaparametros()) : "") + (ctx.PARR() != null ? ctx.PARR().getText() + ";": "");
    }


    @Override
    public String visitSecciondeclaracionconstante(MiniPascalParser.SecciondeclaracionconstanteContext ctx) {
        StringBuilder resultado = new StringBuilder("const ");
        for (MiniPascalParser.DefinicionconstanteContext declConst : ctx.definicionconstante()) {
            resultado.append(visitDefinicionconstante(declConst));
        }
        return resultado.toString();
    }
    @Override
    public String visitDefinicionconstante(MiniPascalParser.DefinicionconstanteContext ctx) {
        return ctx.IDENTIFIER().getText() + " = " + visitConstante(ctx.constante()) + ";\n";
    }

    @Override
    public String visitEstructurarepetitiva(MiniPascalParser.EstructurarepetitivaContext ctx) {
        StringBuilder resultado = new StringBuilder();
        if (ctx.buclewhile() != null){
            resultado.append(visitBuclewhile(ctx.buclewhile()));
        } else if (ctx.buclefor() != null){
            resultado.append(visitBuclefor(ctx.buclefor()));
        } else if (ctx.buclerepeat() != null){
            resultado.append(visitBuclerepeat(ctx.buclerepeat()));
        }
        return resultado.toString();
    }

    @Override
    public String visitBuclewhile(MiniPascalParser.BuclewhileContext ctx) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(ctx.WHILE().getText());
        resultado.append(" ");
        resultado.append(visitExpresion(ctx.expresion()));
        resultado.append(" ");
        resultado.append(ctx.DO().getText());
        resultado.append("\n");
        resultado.append(visitInstruccion(ctx.instruccion()));
        return resultado.toString();
    }

    @Override
    public String visitBuclefor(MiniPascalParser.BucleforContext ctx) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(ctx.FOR().getText());
        resultado.append(" ");
        resultado.append(ctx.IDENTIFIER().getText());
        scopeManager.getSymbolTable().setLine(ctx.start.getLine());
        scopeManager.getSymbolTable().setColumn(ctx.start.getCharPositionInLine());
        Symbol symbol = scopeManager.getSymbolTable().lookup(ctx.IDENTIFIER().getText());
        scopeManager.getSymbolTable().verifyOperationType(symbol, "integer");
        resultado.append(" ");
        resultado.append(ctx.ASSIGN().getText());
        resultado.append(" ");
        resultado.append(visitListafor(ctx.listafor()));
        resultado.append(" ");
        resultado.append(ctx.DO().getText());
        resultado.append("\n");
        resultado.append(visitInstruccion(ctx.instruccion()));
        return resultado.toString();
    }

    @Override
    public String visitListafor(MiniPascalParser.ListaforContext ctx){
        StringBuilder resultado = new StringBuilder();
        resultado.append(visitExpresion(ctx.expresion(0)));
        resultado.append(" ");
        if (ctx.DOWNTO() != null){
             resultado.append(ctx.DOWNTO().getText());
        } else {
            resultado.append(ctx.TO().getText());

        }
        resultado.append(" ");
        resultado.append(visitExpresion(ctx.expresion(1)));
        return resultado.toString();
    }

    @Override
    public String visitBuclerepeat(MiniPascalParser.BuclerepeatContext ctx) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(ctx.REPEAT().getText());
        resultado.append("\n");
        resultado.append(visitInstrucciones(ctx.instrucciones()));
        resultado.append(ctx.UNTIL().getText());
        resultado.append(" ");
        resultado.append(visitExpresion(ctx.expresion()));
        return resultado.toString();
    }

    @Override
    public String visitTipolista(MiniPascalParser.TipolistaContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVacio(MiniPascalParser.VacioContext ctx) {
        return ctx.getText();
    }





}


