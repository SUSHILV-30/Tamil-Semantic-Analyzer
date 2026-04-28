// Generated from Tamil.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TamilParser}.
 */
public interface TamilListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TamilParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull TamilParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull TamilParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamilParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(@NotNull TamilParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(@NotNull TamilParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamilParser#adjective}.
	 * @param ctx the parse tree
	 */
	void enterAdjective(@NotNull TamilParser.AdjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#adjective}.
	 * @param ctx the parse tree
	 */
	void exitAdjective(@NotNull TamilParser.AdjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamilParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull TamilParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull TamilParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamilParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(@NotNull TamilParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(@NotNull TamilParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamilParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNounPhrase(@NotNull TamilParser.NounPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNounPhrase(@NotNull TamilParser.NounPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamilParser#adverb}.
	 * @param ctx the parse tree
	 */
	void enterAdverb(@NotNull TamilParser.AdverbContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#adverb}.
	 * @param ctx the parse tree
	 */
	void exitAdverb(@NotNull TamilParser.AdverbContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamilParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhrase(@NotNull TamilParser.VerbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhrase(@NotNull TamilParser.VerbPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TamilParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull TamilParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TamilParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull TamilParser.ObjectContext ctx);
}