// Generated from hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull helloParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull helloParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(@NotNull helloParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(@NotNull helloParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#adjective}.
	 * @param ctx the parse tree
	 */
	void enterAdjective(@NotNull helloParser.AdjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#adjective}.
	 * @param ctx the parse tree
	 */
	void exitAdjective(@NotNull helloParser.AdjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull helloParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull helloParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(@NotNull helloParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(@NotNull helloParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNounPhrase(@NotNull helloParser.NounPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNounPhrase(@NotNull helloParser.NounPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#adverb}.
	 * @param ctx the parse tree
	 */
	void enterAdverb(@NotNull helloParser.AdverbContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#adverb}.
	 * @param ctx the parse tree
	 */
	void exitAdverb(@NotNull helloParser.AdverbContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhrase(@NotNull helloParser.VerbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhrase(@NotNull helloParser.VerbPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull helloParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull helloParser.ObjectContext ctx);
}