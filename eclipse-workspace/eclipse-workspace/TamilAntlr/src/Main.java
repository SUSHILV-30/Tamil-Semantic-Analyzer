import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        String inputFile = args.length > 0 ? args[0] : "input";
        File f = new File(inputFile);

        if (!f.exists()) {
            System.err.println("Input file not found: " + inputFile);
            System.exit(1);
        }

        CharStream cs = CharStreams.fromFileName(inputFile, StandardCharsets.UTF_8);

        TamilLexer lexer = new TamilLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        // Strict Tamil enforcement
        for (Token tok : tokens.getTokens()) {
            if (tok.getType() == TamilLexer.ERROR_CHAR) {
                throw new RuntimeException(
                    "Invalid character detected: '" + tok.getText() +
                    "'. Only Tamil input is allowed."
                );
            }
        }

        TamilParser parser = new TamilParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new ConsoleErrorListener());

        ParseTree tree = parser.file();

        // Semantic Phase
        System.out.println("=== Semantic Analysis ===");
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);

        // Print Parse Tree
        System.out.println("\n=== Textual Parse Tree ===");
        System.out.println(tree.toStringTree(parser));

        // Print Tokens
        System.out.println("\n=== Tokens ===");
        for (Token tok : tokens.getTokens()) {
            String name = TamilLexer.VOCABULARY.getSymbolicName(tok.getType());
            if (name == null) {
                name = Integer.toString(tok.getType());
            }
            System.out.println(name + " -> '" + tok.getText() + "'");
        }

        SwingUtilities.invokeLater(() ->
            createAndShowGui(tree, parser)
        );
    }

    private static void createAndShowGui(ParseTree tree, TamilParser parser) {

        JFrame frame = new JFrame("Tamil Parse Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        List<String> rules = Arrays.asList(parser.getRuleNames());
        TreeViewer view = new TreeViewer(rules, tree);
        view.setScale(1.0);

        JScrollPane scroll = new JScrollPane(view);
        scroll.setPreferredSize(new Dimension(900, 700));

        frame.add(scroll, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}