// Generated from SimpleLexer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleLexerParser}.
 */
public interface SimpleLexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SimpleLexerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SimpleLexerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SimpleLexerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SimpleLexerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(SimpleLexerParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(SimpleLexerParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SimpleLexerParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SimpleLexerParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(SimpleLexerParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(SimpleLexerParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SimpleLexerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SimpleLexerParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SimpleLexerParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SimpleLexerParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(SimpleLexerParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(SimpleLexerParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleLexerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SimpleLexerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleLexerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SimpleLexerParser.ExprContext ctx);
}