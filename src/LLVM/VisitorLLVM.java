package LLVM;

import Parser.MiniPascalBaseVisitor;
import Parser.MiniPascalParser;
import SymbolTable.SymbolTable;
import IR.TACBaseInstruction;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;

public class VisitorLLVM extends MiniPascalBaseVisitor<Void> {
    private List<TACBaseInstruction> ir;
    private SymbolTable symbolTable;
    private int tempVarCounter = 0;
    private int labelCount = 0;
    private Map<String, String> globalStrings;

    public VisitorLLVM(SymbolTable symbolTable) {
        this.ir = new ArrayList<>();
        this.symbolTable = symbolTable;
        this.globalStrings = new HashMap<>();
    }

    private String generateTempVariable() {
        return "%t" + tempVarCounter++;
    }

    private String generateLabel(String prefix) {
        return prefix + (labelCount++);
    }

    public List<TACBaseInstruction> getInstructions() {
        return ir;
    }

    private void addGlobalString(String name, String value) {
        String llvmName = "@str_" + name;
        globalStrings.put(llvmName, "[i8 x " + (value.length() + 1) + "] c\"" + value + "\\00\"");
    }

    public Map<String, String> getGlobalStrings() {
        return globalStrings;
    }

    private boolean isGlobalContext() {
        // Implement logic to determine if the current context is global
        return true; // Placeholder, customize as needed
    }

    @Override
    public Void visitDeclaracionvariable(MiniPascalParser.DeclaracionvariableContext ctx) {
        for (TerminalNode id : ctx.listaidentificadores().IDENTIFIER()) {
            String varName = id.getText();
            if (isGlobalContext()) {
                ir.add(new TACBaseInstruction("global", "@" + varName, "i32 0", null));
            } else {
                ir.add(new TACBaseInstruction("alloca", "%" + varName, "i32", null));
            }
        }
        return null;
    }

    @Override
    public Void visitInstruccionasignacion(MiniPascalParser.InstruccionasignacionContext ctx) {
        String variable = ctx.variable().getText();
        visit(ctx.expresion());
        if (!ir.isEmpty()) {
            String tempVar = ir.get(ir.size() - 1).getResult();
            ir.add(new TACBaseInstruction("store", tempVar, variable, null));
        }
        return null;
    }

    @Override
    public Void visitExpresion(MiniPascalParser.ExpresionContext ctx) {
        visit(ctx.expresionsimple());
        if (!ir.isEmpty()) {
            String leftTempVar = ir.get(ir.size() - 1).getResult();

            if (ctx.operadorrelacional() != null) {
                visit(ctx.expresion());
                if (!ir.isEmpty()) {
                    String rightTempVar = ir.get(ir.size() - 1).getResult();
                    String resultTempVar = generateTempVariable();
                    String relationalOp = ctx.operadorrelacional().getText();
                    ir.add(new TACBaseInstruction(relationalOp, resultTempVar, leftTempVar, rightTempVar));
                }
            }
        }
        return null;
    }

    @Override
    public Void visitEstructuraif(MiniPascalParser.EstructuraifContext ctx) {
        visit(ctx.expresion());
        if (!ir.isEmpty()) {
            String condition = ir.get(ir.size() - 1).getResult();
            String labelTrue = generateLabel("if_true");
            String labelEnd = generateLabel("if_end");

            ir.add(new TACBaseInstruction("br", condition, labelTrue, labelEnd));

            ir.add(new TACBaseInstruction("label", labelTrue, null, null));
            visit(ctx.instruccion(0));

            if (ctx.instruccion().size() > 1) {
                String labelFalse = generateLabel("if_false");
                ir.add(new TACBaseInstruction("br", null, labelFalse, null));
                ir.add(new TACBaseInstruction("label", labelFalse, null, null));
                visit(ctx.instruccion(1));
            }

            ir.add(new TACBaseInstruction("label", labelEnd, null, null));
        }
        return null;
    }

    @Override
    public Void visitDeclaracionfuncion(MiniPascalParser.DeclaracionfuncionContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        ir.add(new TACBaseInstruction("define", "i32 @" + functionName, "(i32 %x)", null));

        visit(ctx.bloque());

        if (!ir.isEmpty()) {
            String returnValue = ir.get(ir.size() - 1).getResult();
            ir.add(new TACBaseInstruction("ret", null, "i32 " + returnValue, null));
        } else {
            ir.add(new TACBaseInstruction("ret", null, "i32 0", null));
        }

        return null;
    }

    @Override
    public Void visitInstruccionprocedimiento(MiniPascalParser.InstruccionprocedimientoContext ctx) {
        String procName = ctx.IDENTIFIER().getText();
        if (ctx.listaparametros() != null) {
            visit(ctx.listaparametros());
        }
        ir.add(new TACBaseInstruction("call", procName, null, null));
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
        if (!ir.isEmpty()) {
            String paramValue = ir.get(ir.size() - 1).getResult();
            ir.add(new TACBaseInstruction("param", paramValue, null, null));
        }
        return null;
    }

    @Override
    public Void visitFactor(MiniPascalParser.FactorContext ctx) {
        if (ctx.variable() != null) {
            String varName = ctx.variable().getText();
            String tempVar = generateTempVariable();
            ir.add(new TACBaseInstruction("load", tempVar, varName, null));
        } else if (ctx.constante() != null) {
            String constValue = ctx.constante().getText();
            String tempVar = generateTempVariable();
            ir.add(new TACBaseInstruction("load_const", tempVar, constValue, null));
        } else if (ctx.NOT() != null) {
            visit(ctx.factor());
            if (!ir.isEmpty()) {
                String factorTempVar = ir.get(ir.size() - 1).getResult();
                String resultTempVar = generateTempVariable();
                ir.add(new TACBaseInstruction("NOT", resultTempVar, factorTempVar, null));
            }
        } else if (ctx.valorbooleano() != null) {
            String boolValue = ctx.valorbooleano().getText();
            String tempVar = generateTempVariable();
            ir.add(new TACBaseInstruction("LOAD_BOOL", tempVar, boolValue, null));
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
}
