import org.antlr.v4.runtime.tree.*;

public class EvalVisitor extends BoolExprBaseVisitor<Boolean> {

    @Override
    public Boolean visitOrExpr(BoolExprParser.OrExprContext ctx) {
        boolean left  = visit(ctx.expr());
        boolean right = visit(ctx.term());
        return left || right;
    }

    @Override
    public Boolean visitToTerm(BoolExprParser.ToTermContext ctx) {
        return visit(ctx.term());
    }

    @Override
    public Boolean visitAndExpr(BoolExprParser.AndExprContext ctx) {
        boolean left  = visit(ctx.term());
        boolean right = visit(ctx.factor());
        return left && right;
    }

    @Override
    public Boolean visitToFactor(BoolExprParser.ToFactorContext ctx) {
        return visit(ctx.factor());
    }

    @Override
    public Boolean visitNotExpr(BoolExprParser.NotExprContext ctx) {
        boolean value = visit(ctx.factor());
        return !value;
    }

    @Override
    public Boolean visitParenExpr(BoolExprParser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Boolean visitTrueExpr(BoolExprParser.TrueExprContext ctx) {
        return true;
    }

    @Override
    public Boolean visitFalseExpr(BoolExprParser.FalseExprContext ctx) {
        return false;
    }
}