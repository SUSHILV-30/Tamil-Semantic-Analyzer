// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ToTerm}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterToTerm(ExprParser.ToTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToTerm}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitToTerm(ExprParser.ToTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(ExprParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSubExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(ExprParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(ExprParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(ExprParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToFactor}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterToFactor(ExprParser.ToFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToFactor}
	 * labeled alternative in {@link ExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitToFactor(ExprParser.ToFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpr}
	 * labeled alternative in {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(ExprParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpr}
	 * labeled alternative in {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(ExprParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ExprParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ExprParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(ExprParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(ExprParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(ExprParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExpr}
	 * labeled alternative in {@link ExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(ExprParser.IdExprContext ctx);
}