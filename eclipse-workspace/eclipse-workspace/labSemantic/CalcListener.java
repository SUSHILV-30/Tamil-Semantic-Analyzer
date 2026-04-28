// Generated from Calc.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(CalcParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(CalcParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CalcParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CalcParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(CalcParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(CalcParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CalcParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CalcParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#term1}.
	 * @param ctx the parse tree
	 */
	void enterTerm1(CalcParser.Term1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#term1}.
	 * @param ctx the parse tree
	 */
	void exitTerm1(CalcParser.Term1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CalcParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CalcParser.FactorContext ctx);
}