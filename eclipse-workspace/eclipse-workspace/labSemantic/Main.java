import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Usage: java Main <input-file>");
            return;
        }

        // Read full file using modern API
        CharStream input = CharStreams.fromFileName(args[0]);

        // Split input file line by line
        String[] lines = input.toString().split("\\r?\\n");

        int windowCount = 1;

        for (String line : lines) {

            if (line.trim().isEmpty())
                continue;

            System.out.println("Input: " + line);

            // Create CharStream from each line
            CharStream ip = CharStreams.fromString(line);

            // Lexer + Parser
            expressionLexer lexer = new expressionLexer(ip);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            expressionParser parser = new expressionParser(tokens);

            // Parse (semantic actions executed here)
            ParseTree tree = parser.start();

            // Print parse tree in string format
            System.out.println("Result printed above from grammar action");
            System.out.println("Tree String Format:");
            System.out.println(tree.toStringTree(parser));

            // ---------------- TREE VIEWER (GUI) ----------------
            JFrame frame = new JFrame("ANTLR Parse Tree - Line " + windowCount);
            JPanel panel = new JPanel();

            TreeViewer viewer =
                    new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.setScale(1.5);

            panel.add(viewer);
            frame.add(panel);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

            System.out.println("-----------------------------------------------------------");
            windowCount++;
        }
    }
}