
import java.io.IOException;
import org.antlr.v4.runtime.*;

public class Main {

    public static void main(String[] args) throws IOException {

        CharStream input = CharStreams.fromFileName("input.txt");

        HelloLexer lexer = new HelloLexer(input);
        Token token;

        while ((token = lexer.nextToken()).getType() != Token.EOF) {

            String tokenName
                    = lexer.getRuleNames()[token.getType() - 1];

            System.out.println(
                    token.getLine() + ":"
                    + token.getCharPositionInLine()
                    + " <" + tokenName + "," + token.getText() + ">"
            );
        }
    }
}
