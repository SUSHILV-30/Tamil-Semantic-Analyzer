// Generated from expression.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link expressionParser}.
 */
public interface expressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link expressionParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(expressionParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(expressionParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(expressionParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(expressionParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#exprP}.
	 * @param ctx the parse tree
	 */
	void enterExprP(expressionParser.ExprPContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#exprP}.
	 * @param ctx the parse tree
	 */
	void exitExprP(expressionParser.ExprPContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(expressionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(expressionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#termP}.
	 * @param ctx the parse tree
	 */
	void enterTermP(expressionParser.TermPContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#termP}.
	 * @param ctx the parse tree
	 */
	void exitTermP(expressionParser.TermPContext ctx);
	/**
	 * Enter a parse tree produced by {@link expressionParser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(expressionParser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link expressionParser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(expressionParser.FactContext ctx);
}