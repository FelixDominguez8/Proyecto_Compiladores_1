// Generated from MiniPascal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniPascalParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniPascalParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#varDeclList}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclList(MiniPascalParser.VarDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#varDeclList}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclList(MiniPascalParser.VarDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MiniPascalParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MiniPascalParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniPascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniPascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MiniPascalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MiniPascalParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniPascalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniPascalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(MiniPascalParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(MiniPascalParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniPascalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniPascalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniPascalParser.FactorContext ctx);
}