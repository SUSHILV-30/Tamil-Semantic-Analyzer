import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String input = "NOT (true AND false) OR true";

        CharStream cs = CharStreams.fromString(input);
        BoolExprLexer lexer = new BoolExprLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BoolExprParser parser = new BoolExprParser(tokens);

        ParseTree tree = parser.expr();

        ParseTreeWalker walker = new ParseTreeWalker();
        EvalListener listener = new EvalListener();

        walker.walk(listener, tree);

        System.out.println("Final Result: " + listener.getResult());
    }
}