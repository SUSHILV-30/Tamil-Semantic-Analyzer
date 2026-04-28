// Generated from Tamil.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TamilParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TamilVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TamilParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(TamilParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamilParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(TamilParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamilParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(TamilParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamilParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(TamilParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamilParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(TamilParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamilParser#verbPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbPhrase(TamilParser.VerbPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamilParser#nounPhrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounPhrase(TamilParser.NounPhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamilParser#adjective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjective(TamilParser.AdjectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TamilParser#adverb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdverb(TamilParser.AdverbContext ctx);
}