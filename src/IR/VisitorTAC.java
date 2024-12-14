package IR;

import Parser.MiniPascalBaseVisitor;
import Parser.MiniPascalParser;
import SymbolTable.SymbolTable;
import java.util.List;
import SymbolTable.*;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VisitorTAC extends MiniPascalBaseVisitor<Void> {
    private TACInstructionsIR ir;
    private SymbolTable symbolTable;
    private int tempVarCounter = 0;
    private int labelCount = 0;
    String ParametroActual = "";

    public VisitorTAC(TACInstructionsIR ir, SymbolTable symbolTable) {
        this.ir = ir;
        this.symbolTable = symbolTable;
    }

    private String generateTempVariable() {
        return "%_t" + tempVarCounter++;
    }

    private String generateLabel(String prefix) {
        return prefix + "_" + (labelCount++);
    }

    @Override
    public Void visitInstruccionasignacion(MiniPascalParser.InstruccionasignacionContext ctx) {
        String variable = ctx.variable().getText();
        visit(ctx.expresion());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String tempVar = instructions.get(instructions.size() - 1).getOperand1();
            ir.addInstruction(new TACBaseInstruction("ASSIGN", variable, tempVar, null));
        }
        return null;
    }

    @Override
    public Void visitExpresion(MiniPascalParser.ExpresionContext ctx) {
        visit(ctx.expresionsimple());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String leftTempVar = instructions.get(instructions.size() - 1).getResult();

            if (ctx.operadorrelacional() != null) {
                visit(ctx.expresion());
                instructions = ir.getInstructions();
                if (!instructions.isEmpty()) {
                    String rightTempVar = instructions.get(instructions.size() - 1).getResult();
                    String resultTempVar = generateTempVariable();
                    String relationalOp = ctx.operadorrelacional().getText();
                    ir.addInstruction(new TACBaseInstruction(relationalOp, resultTempVar, leftTempVar, rightTempVar));
                }
            }
        }
        return null;
    }

    @Override
    public Void visitExpresionsimple(MiniPascalParser.ExpresionsimpleContext ctx) {
        visit(ctx.termino());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String leftTempVar = instructions.get(instructions.size() - 1).getResult();

            if (ctx.operadoraditivo() != null) {
                visit(ctx.expresionsimple());
                instructions = ir.getInstructions();
                if (!instructions.isEmpty()) {
                    String rightTempVar = instructions.get(instructions.size() - 1).getResult();
                    String resultTempVar = generateTempVariable();
                    String additiveOp = ctx.operadoraditivo().getText();
                    ir.addInstruction(new TACBaseInstruction(additiveOp, resultTempVar, leftTempVar, rightTempVar));
                }
            }
        }
        return null;
    }

    @Override
    public Void visitTermino(MiniPascalParser.TerminoContext ctx) {
        visit(ctx.signofactor());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String leftTempVar = instructions.get(instructions.size() - 1).getResult();

            if (ctx.operadormultiplicativo() != null) {
                visit(ctx.termino());
                instructions = ir.getInstructions();
                if (!instructions.isEmpty()) {
                    String rightTempVar = instructions.get(instructions.size() - 1).getResult();
                    String resultTempVar = generateTempVariable();
                    String multiplicativeOp = ctx.operadormultiplicativo().getText();
                    ir.addInstruction(new TACBaseInstruction(multiplicativeOp, resultTempVar, leftTempVar, rightTempVar));
                }
            }
        }
        return null;
    }

    @Override
    public Void visitSignofactor(MiniPascalParser.SignofactorContext ctx) {
        if (ctx.PLUS() != null || ctx.MINUS() != null) {
            visit(ctx.factor());
            List<TACBaseInstruction> instructions = ir.getInstructions();
            if (!instructions.isEmpty()) {
                String factorTempVar = instructions.get(instructions.size() - 1).getResult();
                String resultTempVar = generateTempVariable();
                String unaryOp = ctx.PLUS() != null ? "+" : "-";
                ir.addInstruction(new TACBaseInstruction(unaryOp, resultTempVar, factorTempVar, null));
            }
        } else {
            visit(ctx.factor());
        }
        return null;
    }

    @Override
    public Void visitFactor(MiniPascalParser.FactorContext ctx) {
        if (ctx.variable() != null) {
            String varName = ctx.variable().getText();
            String resultTempVar = generateTempVariable();
            ir.addInstruction(new TACBaseInstruction("LOAD", resultTempVar, varName, null));
        } else if (ctx.expresion() != null) {
            visit(ctx.expresion());
        } else if (ctx.designarfuncion() != null) {
            visit(ctx.designarfuncion());
        } else if (ctx.constante() != null) {
            String constValue = ctx.constante().getText();
            String tempVar = generateTempVariable();
            ir.addInstruction(new TACBaseInstruction("LOAD_CONST", null, constValue, null));
        } else if (ctx.NOT() != null) {
            visit(ctx.factor());
            List<TACBaseInstruction> instructions = ir.getInstructions();
            if (!instructions.isEmpty()) {
                String factorTempVar = instructions.get(instructions.size() - 1).getResult();
                String resultTempVar = generateTempVariable();
                ir.addInstruction(new TACBaseInstruction("NOT", resultTempVar, factorTempVar, null));
            }
        } else if (ctx.valorbooleano() != null) {
            String boolValue = ctx.valorbooleano().getText();
            String tempVar = generateTempVariable();
            ir.addInstruction(new TACBaseInstruction("LOAD_BOOL", tempVar, boolValue, null));
        }
        return null;
    }

    @Override
    public Void visitEstructuraif(MiniPascalParser.EstructuraifContext ctx) {
        visit(ctx.expresion());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String condition = instructions.get(instructions.size() - 1).getResult();
            String labelTrue = generateTempVariable();
            String labelEnd = generateTempVariable();
            ir.addInstruction(new TACBaseInstruction("IF", condition, labelTrue, null));
            visit(ctx.instruccion(0));
            ir.addInstruction(new TACBaseInstruction("GOTO", labelEnd, null, null));
            ir.addInstruction(new TACBaseInstruction("LABEL", labelTrue, null, null));
            if (ctx.instruccion().size() > 1) {
                visit(ctx.instruccion(1));
            }
            ir.addInstruction(new TACBaseInstruction("LABEL", labelEnd, null, null));
        }
        return null;
    }

    @Override
    public Void visitBuclewhile(MiniPascalParser.BuclewhileContext ctx) {
        String labelStart = generateTempVariable();
        String labelEnd = generateTempVariable();
        ir.addInstruction(new TACBaseInstruction("LABEL", labelStart, null, null));
        visit(ctx.expresion());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String condition = instructions.get(instructions.size() - 1).getResult();
            ir.addInstruction(new TACBaseInstruction("IF_FALSE", condition, labelEnd, null));
            visit(ctx.instruccion());
            ir.addInstruction(new TACBaseInstruction("GOTO", labelStart, null, null));
            ir.addInstruction(new TACBaseInstruction("LABEL", labelEnd, null, null));
        }
        return null;
    }

    @Override
    public Void visitBuclefor(MiniPascalParser.BucleforContext ctx) {
        // Check if there is an assignment instruction
        if (ctx.instruccion() != null && ctx.instruccion().tipoinstruccion() != null) {
            MiniPascalParser.InstruccionsimpleContext simpleCtx = ctx.instruccion().tipoinstruccion().instruccionsimple();
            if (simpleCtx != null && simpleCtx.instruccionasignacion() != null) {
                visit(simpleCtx.instruccionasignacion()); // Initialize the counter
            }
        }

        String labelStart = generateLabel("FOR_START");
        String labelEnd = generateLabel("FOR_END");
        ir.addInstruction(new TACBaseInstruction("LABEL", labelStart, null, null));

        // Loop condition
        visit(ctx.listafor());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String condition = instructions.get(instructions.size() - 1).getResult();
            ir.addInstruction(new TACBaseInstruction("IF_FALSE", condition, labelEnd, null));
        }

        // Loop body
        visit(ctx.instruccion());

        // Implicit increment/decrement
        String iterator = ctx.IDENTIFIER().getText();
        ir.addInstruction(new TACBaseInstruction("INCREMENT", iterator, "1", null));

        // Jump to the start of the loop
        ir.addInstruction(new TACBaseInstruction("GOTO", labelStart, null, null));

        ir.addInstruction(new TACBaseInstruction("LABEL", labelEnd, null, null));
        return null;
    }

    @Override
    public Void visitBuclerepeat(MiniPascalParser.BuclerepeatContext ctx) {
        String labelStart = generateLabel("REPEAT_START");
        ir.addInstruction(new TACBaseInstruction("LABEL", labelStart, null, null));
        for (MiniPascalParser.InstruccionContext instrCtx : ctx.instrucciones().instruccion()) {
            visit(instrCtx);
        }
        visit(ctx.expresion());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String condition = instructions.get(instructions.size() - 1).getResult();
            ir.addInstruction(new TACBaseInstruction("IF_FALSE", condition, labelStart, null));
        }
        return null;
    }

    @Override
    public Void visitSecciondeclaracionconstante(MiniPascalParser.SecciondeclaracionconstanteContext ctx) {
        for (MiniPascalParser.DefinicionconstanteContext defConst : ctx.definicionconstante()) {
            visit(defConst);
        }
        return null;
    }

    @Override
    public Void visitDefinicionconstante(MiniPascalParser.DefinicionconstanteContext ctx) {
        String constName = ctx.IDENTIFIER().getText();
        visit(ctx.constante());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String constValue = instructions.get(instructions.size() - 1).getResult();
            ir.addInstruction(new TACBaseInstruction("CONST", constName, constValue, null));
        }
        return null;
    }

    @Override
    public Void visitInstruccionprocedimiento(MiniPascalParser.InstruccionprocedimientoContext ctx) {
        String procName = ctx.IDENTIFIER().getText();
        if (ctx.listaparametros() != null) {
            visit(ctx.listaparametros());
        }
        List<TACBaseInstruction> instructions = ir.getInstructions();
        String constValue = instructions.get(instructions.size() - 1).getResult();
        String constValue2 = instructions.get(instructions.size() - 1).getOperand1(); //Regresare
        ir.addInstruction(new TACBaseInstruction("CALL", procName, constValue, "%d"));
        return null;
    }

    @Override
    public Void visitDesignarfuncion(MiniPascalParser.DesignarfuncionContext ctx) {
        String funcName = ctx.IDENTIFIER().getText();
        if (ctx.listaparametros() != null) {
            visit(ctx.listaparametros());
        }
        String resultTempVar = generateTempVariable();
        ir.addInstruction(new TACBaseInstruction("CALL", funcName, resultTempVar, null));
        ir.addInstruction(new TACBaseInstruction("ASSIGN", ctx.getText(), resultTempVar, null));
        return null;
    }

    @Override
    public Void visitSecciondeclaracionprocesoofuncion(MiniPascalParser.SecciondeclaracionprocesoofuncionContext ctx) {
        MiniPascalParser.DeclaracionprocesoofuncionContext declCtx = ctx.declaracionprocesoofuncion();

        if (declCtx.declaracionproceso() != null) {
            visit(declCtx.declaracionproceso());
        } else if (declCtx.declaracionfuncion() != null) {
            visit(declCtx.declaracionfuncion());
        }

        return null;
    }

    @Override
    public Void visitBloqueinstruccion(MiniPascalParser.BloqueinstruccionContext ctx) {

        if (ctx.instrucciones() != null) {
            visit(ctx.instrucciones());
        }

        return null;
    }


    @Override
    public Void visitDeclaracionfuncion(MiniPascalParser.DeclaracionfuncionContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        TACBaseInstruction funcLabelInstr = new TACBaseInstruction("LABEL", functionName, null, null);
        ir.addInstruction(funcLabelInstr);

        if (ctx.listaformalparametros() != null) {
            visit(ctx.listaformalparametros());
        }

        String returnTypeText = ctx.tipoidentificador().getText().toUpperCase();

        visit(ctx.bloque());

        // Use a temporary variable to store the function result
        String resultTempVar = generateTempVariable();
        TACBaseInstruction assignResultInstr = new TACBaseInstruction("ASSIGN", resultTempVar, ir.getInstructions().get(ir.getInstructions().size() - 1).getResult(), null);
        ir.addInstruction(assignResultInstr);

        TACBaseInstruction returnInstr = new TACBaseInstruction("RETURN", resultTempVar, null, null);
        ir.addInstruction(returnInstr);

        return null;
    }

    @Override
    public Void visitListaparametros(MiniPascalParser.ListaparametrosContext ctx) {
        for (MiniPascalParser.ParametroactualContext param : ctx.parametroactual()) {
            visit(param);
        }
        return null;
    }

    @Override
    public Void visitParametroactual(MiniPascalParser.ParametroactualContext ctx) {
        visit(ctx.expresion());
        List<TACBaseInstruction> instructions = ir.getInstructions();
        if (!instructions.isEmpty()) {
            String paramValue = instructions.get(instructions.size() - 1).getOperand1();
            ParametroActual = paramValue;
        }
        return null;
    }

    @Override
    public Void visitSecciondeclaracionvariable(MiniPascalParser.SecciondeclaracionvariableContext ctx) {
        for (MiniPascalParser.DeclaracionvariableContext declVar : ctx.declaracionvariable()) {
            visit(declVar);
        }
        return null;
    }


    @Override
    public Void visitDeclaracionvariable(MiniPascalParser.DeclaracionvariableContext ctx) {
        for (TerminalNode id : ctx.listaidentificadores().IDENTIFIER()) {
            String varName = id.getText();
            ir.addInstruction(new TACBaseInstruction("VAR", varName, null, null));
        }
        return null;
    }


}