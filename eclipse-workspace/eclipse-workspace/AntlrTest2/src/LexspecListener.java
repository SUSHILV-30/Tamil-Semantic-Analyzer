// Generated from Lexspec.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexspecParser}.
 */
public interface LexspecListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexspecParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(LexspecParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexspecParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(LexspecParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexspecParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LexspecParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexspecParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LexspecParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexspecParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LexspecParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexspecParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LexspecParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexspecParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LexspecParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexspecParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LexspecParser.FactorContext ctx);
}