// Generated from Hello.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(HelloParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(HelloParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HelloParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HelloParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#blankLine}.
	 * @param ctx the parse tree
	 */
	void enterBlankLine(HelloParser.BlankLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#blankLine}.
	 * @param ctx the parse tree
	 */
	void exitBlankLine(HelloParser.BlankLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#poeticLine}.
	 * @param ctx the parse tree
	 */
	void enterPoeticLine(HelloParser.PoeticLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#poeticLine}.
	 * @param ctx the parse tree
	 */
	void exitPoeticLine(HelloParser.PoeticLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#proseParagraph}.
	 * @param ctx the parse tree
	 */
	void enterProseParagraph(HelloParser.ProseParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#proseParagraph}.
	 * @param ctx the parse tree
	 */
	void exitProseParagraph(HelloParser.ProseParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(HelloParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(HelloParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nominalClause}.
	 * @param ctx the parse tree
	 */
	void enterNominalClause(HelloParser.NominalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nominalClause}.
	 * @param ctx the parse tree
	 */
	void exitNominalClause(HelloParser.NominalClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleNounPhrase}
	 * labeled alternative in {@link HelloParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNounPhrase(HelloParser.SimpleNounPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleNounPhrase}
	 * labeled alternative in {@link HelloParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNounPhrase(HelloParser.SimpleNounPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhrase(HelloParser.VerbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhrase(HelloParser.VerbPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#objectPhrase}.
	 * @param ctx the parse tree
	 */
	void enterObjectPhrase(HelloParser.ObjectPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#objectPhrase}.
	 * @param ctx the parse tree
	 */
	void exitObjectPhrase(HelloParser.ObjectPhraseContext ctx);
}