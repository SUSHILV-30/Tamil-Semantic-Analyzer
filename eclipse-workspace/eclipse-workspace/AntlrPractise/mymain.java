import java.io.IOException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class mymain {
    public static void main(String[] args) throws IOException {

        // Read input from file
        CharStream input = new ANTLRFileStream("input.txt");

        // LEXER
        SimpleLexer lexer = new SimpleLexer(input);
        Token token;

        System.out.println("TOKENS:");
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            String tokenName = lexer.getVocabulary()
                                    .getSymbolicName(token.getType());

            System.out.println(
                token.getLine() + ":" +
                token.getCharPositionInLine() +
                " <" + tokenName + "," + token.getText() + ">"
            );
        }

        // Reset lexer for parser
        lexer.reset();

        // PARSER
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleLexerParser parser = new SimpleLexerParser(tokens);

        ParseTree tree = parser.prog();

        // Print parse tree in console
        System.out.println("\nPARSE TREE (text):");
        System.out.println(tree.toStringTree(parser));

        // Show parse tree in GUI
        JFrame frame = new JFrame("ANTLR Parse Tree");
        JPanel panel = new JPanel();
        TreeViewer viewer =
            new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);

        viewer.setScale(1.5);
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
