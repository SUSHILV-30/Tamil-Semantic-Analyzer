// Generated from BoolExpr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoolExprParser}.
 */
public interface BoolExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ToTerm}
	 * labeled alternative in {@link BoolExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterToTerm(BoolExprParser.ToTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToTerm}
	 * labeled alternative in {@link BoolExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitToTerm(BoolExprParser.ToTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link BoolExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(BoolExprParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link BoolExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(BoolExprParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link BoolExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(BoolExprParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link BoolExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(BoolExprParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToFactor}
	 * labeled alternative in {@link BoolExprParser#term}.
	 * @param ctx the parse tree
	 */
	void enterToFactor(BoolExprParser.ToFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToFactor}
	 * labeled alternative in {@link BoolExprParser#term}.
	 * @param ctx the parse tree
	 */
	void exitToFactor(BoolExprParser.ToFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(BoolExprParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(BoolExprParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(BoolExprParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(BoolExprParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(BoolExprParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(BoolExprParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(BoolExprParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(BoolExprParser.FalseExprContext ctx);
}