import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String input = "3 + 4 * (2 - 1) - -5";

        CharStream cs = CharStreams.fromString(input);
        ExprLexer lexer = new ExprLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        ParseTree tree = parser.expr();

        EvalVisitor visitor = new EvalVisitor();
        Double result = visitor.visit(tree);

        System.out.println("Input: " + input);
        System.out.println("Result: " + result);
    }
}