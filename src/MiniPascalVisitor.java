import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import Parser.*;

public class MiniPascalVisitor extends  MiniPascalBaseVisitor<Void>{

    @Override
    public Void visitProgram(MiniPascalParser.ProgramContext ctx){
        System.out.println("visitProgram: " + ctx.IDENTIFIER().getText());
        visit(ctx.block());
        return null;
    }

    //visitar una declaracion de variable
    @Override
    public Void visitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx){
        System.out.println("visitVarDeclaration: " + ctx.varDeclList().getText());
        visit(ctx.varDeclList());
        return null;
    }

    //lista de variables
    @Override
    public Void visitVarDeclList(MiniPascalParser.VarDeclListContext ctx) {
        for (MiniPascalParser.VarDeclContext varDeclContext : ctx.varDecl()) {
            visit(varDeclContext);
        }
        return null;
    }
    //visitar una variable en especifico
    @Override
    public Void visitVarDecl(MiniPascalParser.VarDeclContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        System.out.println("Variable declared: " + variableName);
        visit(ctx.type());
        return null;
    }
    //ver el tipo de dato de una variable
    @Override
    public Void visitType(MiniPascalParser.TypeContext ctx) {
        if (ctx.INTEGER() != null) {
            System.out.println("Type: integer");
        } else if (ctx.CHAR() != null) {
            System.out.println("Type: char");
        } else if (ctx.STRING() != null) {
            System.out.println("Type: string");
        } else if (ctx.BOOLEAN() != null) {
            System.out.println("Type: boolean");
        } else if (ctx.arrayType() != null) {
            visit(ctx.arrayType());
            System.out.println("Type: array");
        }
        return null;
    }

    // Visitar tipo de datos de un arreglo







}
