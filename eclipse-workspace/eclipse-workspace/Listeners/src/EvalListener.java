import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTree;

public class EvalListener extends ExprBaseListener {

    ParseTreeProperty<Integer> values = new ParseTreeProperty<>();

    private void setValue(ParseTree node, int value) {
        values.put(node, value);
    }

    private int getValue(ParseTree node) {
        return values.get(node);
    }

    @Override
    public void exitE(ExprParser.EContext ctx) {

        if (ctx.getChildCount() == 3) { // e op e
            int left = getValue(ctx.e(0));
            int right = getValue(ctx.e(1));
            int result;

            if (ctx.op.getType() == ExprParser.MULT) {
                result = left * right;
                System.out.println("Computed: " + left + " * " + right + " = " + result);
            } else {
                result = left + right;
                System.out.println("Computed: " + left + " + " + right + " = " + result);
            }

            setValue(ctx, result);
        }
        else { // INT
            int value = Integer.parseInt(ctx.INT().getText());
            System.out.println("Read INT: " + value);
            setValue(ctx, value);
        }
    }

    public int getResult(ExprParser.SContext ctx) {
        return values.get(ctx.e());
    }
}
