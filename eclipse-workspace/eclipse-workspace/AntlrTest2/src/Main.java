// Main.java
// Shows parse tree in a Swing GUI using ANTLR's TreeViewer.

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

        String inputFile = args.length > 0 ? args[0] : "input.txt";
        File f = new File(inputFile);

        if (!f.exists()) {
            System.err.println("Input file not found: " + inputFile);
            System.exit(1);
        }

        // Read file as UTF-8
        CharStream cs = CharStreams.fromFileName(inputFile, StandardCharsets.UTF_8);

        // Create lexer & parser
        TamilLexer lexer = new TamilLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TamilParser parser = new TamilParser(tokens);

        // Optional: Better error reporting
        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.addErrorListener(new ConsoleErrorListener());

        // Parse starting rule
        ParseTree tree = parser.file();

        // Print textual parse tree
        System.out.println("=== Textual Parse Tree ===");
        System.out.println(tree.toStringTree(parser));

        // Print tokens
        System.out.println("\n=== Tokens ===");
        tokens.fill();
        for (Token tok : tokens.getTokens()) {
            String name = TamilLexer.VOCABULARY.getSymbolicName(tok.getType());
            if (name == null) {
                name = Integer.toString(tok.getType());
            }
            System.out.println(name + " -> '" + tok.getText() + "'");
        }

        // Build GUI safely on EDT
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

        JPanel controlPanel = new JPanel();

        JButton zoomIn = new JButton("Zoom In");
        JButton zoomOut = new JButton("Zoom Out");
        JButton reset = new JButton("Reset Zoom");

        controlPanel.add(zoomIn);
        controlPanel.add(zoomOut);
        controlPanel.add(reset);

        zoomIn.addActionListener(e -> {
            view.setScale(view.getScale() + 0.2);
            view.revalidate();
            view.repaint();
        });

        zoomOut.addActionListener(e -> {
            view.setScale(Math.max(0.2, view.getScale() - 0.2));
            view.revalidate();
            view.repaint();
        });

        reset.addActionListener(e -> {
            view.setScale(1.0);
            view.revalidate();
            view.repaint();
        });

        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(scroll, BorderLayout.CENTER);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");

        JMenuItem printTree = new JMenuItem("Print textual tree to console");
        printTree.addActionListener(e ->
            System.out.println(tree.toStringTree(parser))
        );

        menu.add(printTree);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}