// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(ExprParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(ExprParser.SContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(ExprParser.IntContext ctx);
}