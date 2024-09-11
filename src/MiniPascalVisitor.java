
import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.TerminalNode;
import Parser.*;

public class MiniPascalVisitor extends MiniPascalBaseVisitor<String> {
    // Llama a visitar el encabezado y el bloque del programa
    @Override
    public String visitPrograma(MiniPascalParser.ProgramaContext ctx) {

        String encabezado = visitEncabezado(ctx.encabezado());
        String bloque = visitBloque(ctx.bloque());
        return encabezado + "\n" + bloque + ".";
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
        for (MiniPascalParser.SecciondeclaracionconstanteContext secConst : ctx.secciondeclaracionconstante()) {
            resultado.append(visitSecciondeclaracionconstante(secConst)).append("\n");
        }
        for (MiniPascalParser.SecciondeclaracionvariableContext secVar : ctx.secciondeclaracionvariable()) {
            resultado.append(visitSecciondeclaracionvariable(secVar)).append("\n");
        }
        for (MiniPascalParser.SecciondeclaracionprocesoofuncionContext secProcFunc : ctx.secciondeclaracionprocesoofuncion()) {
            resultado.append(visitSecciondeclaracionprocesoofuncion(secProcFunc)).append("\n");
        }
        resultado.append(visitBloqueinstruccion(ctx.bloqueinstruccion()));
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
        return identificadores + " : " + tipo;
    }
    // Visita el bloque de instrucciones
    @Override
    public String visitBloqueinstruccion(MiniPascalParser.BloqueinstruccionContext ctx) {

        StringBuilder resultado = new StringBuilder("begin\n");
        resultado.append(visitInstrucciones(ctx.instrucciones()));
        resultado.append("\nend");
        return resultado.toString();
    }

    // Visita la lista de instrucciones
    @Override
    public String visitInstrucciones(MiniPascalParser.InstruccionesContext ctx) {

        return ctx.instruccion().stream().map(this::visitInstruccion).collect(Collectors.joining(";\n"));
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
        }
        return "";
    }

    // Visita una instrucción simple (asignación, procedimiento, o vacía)
    @Override
    public String visitInstruccionsimple(MiniPascalParser.InstruccionsimpleContext ctx) {

        if (ctx.instruccionasignacion() != null) {
            return visitInstruccionasignacion(ctx.instruccionasignacion());
        }
        return "";
    }
    // Visita una instrucción de asignación
    @Override
    public String visitInstruccionasignacion(MiniPascalParser.InstruccionasignacionContext ctx) {

        String variable = visitVariable(ctx.variable());
        String expresion = visitExpresion(ctx.expresion());
        return variable + " := " + expresion;
    }

    // Visita una expresión
    @Override
    public String visitExpresion(MiniPascalParser.ExpresionContext ctx) {

        return visitExpresionsimple(ctx.expresionsimple());
    }

    @Override
    public String visitExpresionsimple(MiniPascalParser.ExpresionsimpleContext ctx) {
        return visitTermino(ctx.termino());
    }
    // Visita un término

    @Override
    public String visitTermino(MiniPascalParser.TerminoContext ctx) {

        return ctx.getText();
    }
    @Override
    public String visitVariable(MiniPascalParser.VariableContext ctx) {
        StringBuilder resultado = new StringBuilder(ctx.IDENTIFIER(0).getText());

        for (int i = 1; i < ctx.IDENTIFIER().size(); i++) {
            resultado.append(".").append(ctx.IDENTIFIER(i).getText());
        }

        if (ctx.LBRACKET() != null) {
            for (MiniPascalParser.ExpresionContext expr : ctx.expresion()) {
                resultado.append("[").append(visitExpresion(expr)).append("]");
            }
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
        String baseType = visitTipo(ctx.tipo()); // Procesa el tipo base del arreglo
        String dimensiones = visitTiposubrango(ctx.tipolista().tiposimple().getFirst().tiposubrango()); // Procesa las dimensiones del arreglo
        return "array[" + dimensiones + "] of " + baseType;
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








}

