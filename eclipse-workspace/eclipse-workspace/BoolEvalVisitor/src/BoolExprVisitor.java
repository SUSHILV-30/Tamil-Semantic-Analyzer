// Generated from BoolExpr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoolExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoolExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code toTerm}
	 * labeled alternative in {@link BoolExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTerm(BoolExprParser.ToTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link BoolExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(BoolExprParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toFactor}
	 * labeled alternative in {@link BoolExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToFactor(BoolExprParser.ToFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link BoolExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(BoolExprParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(BoolExprParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(BoolExprParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(BoolExprParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(BoolExprParser.FalseExprContext ctx);
}