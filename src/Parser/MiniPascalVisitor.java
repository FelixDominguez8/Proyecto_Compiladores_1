// Generated from C:/Users/Alberth/OneDrive - Universidad Tecnologica Centroamericana/Documents/Unitec/2024/III Trimestre/Compiladores_1/proyecto/nuevo_proyecto_compi/Proyecto_Compiladores_1/src/MiniPascal.g4 by ANTLR 4.13.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#varDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclList(MiniPascalParser.VarDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(MiniPascalParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniPascalParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(MiniPascalParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#arrayDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDimension(MiniPascalParser.ArrayDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MiniPascalParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#writeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#readStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(MiniPascalParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiniPascalParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiniPascalParser.FactorContext ctx);
}