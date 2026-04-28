import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String input = "TRUE AND NOT (FALSE OR TRUE)";

        CharStream cs = CharStreams.fromString(input);
        BoolExprLexer lexer = new BoolExprLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BoolExprParser parser = new BoolExprParser(tokens);

        ParseTree tree = parser.expr();

        EvalVisitor visitor = new EvalVisitor();
        Boolean result = visitor.visit(tree);

        System.out.println("Input: " + input);
        System.out.println("Result: " + result);
    }
}