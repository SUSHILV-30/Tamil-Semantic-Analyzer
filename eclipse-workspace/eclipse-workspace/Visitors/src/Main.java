import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String expression = "2 + 3 * 4";

        CharStream input = CharStreams.fromString(expression);

        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        ParseTree tree = parser.s();

        EvalVisitor visitor = new EvalVisitor();

        int result = visitor.visit(tree);

        System.out.println("Expression: " + expression);
        System.out.println("Final result: " + result);
    }
}
