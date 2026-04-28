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
	 * Visit a parse tree produced by the {@code ToTerm}
	 * labeled alternative in {@link BoolExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToTerm(BoolExprParser.ToTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link BoolExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(BoolExprParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link BoolExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(BoolExprParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToFactor}
	 * labeled alternative in {@link BoolExprParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToFactor(BoolExprParser.ToFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(BoolExprParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(BoolExprParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(BoolExprParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link BoolExprParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(BoolExprParser.FalseExprContext ctx);
}