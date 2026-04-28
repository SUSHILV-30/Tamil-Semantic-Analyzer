// Generated from hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(helloParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(helloParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(helloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(helloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(helloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(helloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(helloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(helloParser.FactorContext ctx);
}