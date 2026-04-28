import org.antlr.v4.runtime.*;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            System.err.println("Usage: java Main <input-file>");
            System.exit(1);
        }

        String input = new String(Files.readAllBytes(Paths.get(args[0])));

        CharStream cs = CharStreams.fromString(input);
        AmritaNumbersLexer lexer = new AmritaNumbersLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();
        List<Token> allTokens = tokens.getTokens();

        for (Token t : allTokens) {
            String name = AmritaNumbersLexer.VOCABULARY.getSymbolicName(t.getType());
            if (name == null) name = "OTHER";
            System.out.printf("%-15s : '%s'\n", name, t.getText());
        }
    }
}
