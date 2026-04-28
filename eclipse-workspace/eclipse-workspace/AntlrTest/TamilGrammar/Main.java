// Main.java
// Shows parse tree in a Swing GUI using ANTLR's TreeViewer.
// Compile/run with your antlr jar on the classpath (example in your commands).

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

        // Create lexer/parser (generated classes must be present)
        TamilLexer lexer = new TamilLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TamilParser parser = new TamilParser(tokens);

        // Parse using start rule 'file'
        ParseTree tree = parser.file();

        // Print textual parse tree and token stream to console
        System.out.println("=== Textual Parse Tree ===");
        System.out.println(tree.toStringTree(parser));

        System.out.println("\n=== Tokens (with special handling for days & months) ===");
        tokens.fill();
        for (Token tok : tokens.getTokens()) {
            String symbolicName = TamilLexer.VOCABULARY.getSymbolicName(tok.getType());
            if (symbolicName == null) {
                symbolicName = Integer.toString(tok.getType());
            }

            String extra = "";
            if ("TAMIL_DAY".equals(symbolicName)) {
                extra = "  [Tamil weekday]";
            } else if ("TAMIL_MONTH".equals(symbolicName)) {
                extra = "  [Tamil month]";
            }

            System.out.println(symbolicName + extra + " -> '" + tok.getText() + "'");
        }

        // Build GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            createAndShowGui(tree, parser.getRuleNames());
        });
    }

    private static void createAndShowGui(ParseTree tree, String[] ruleNames) {
        // Create a JFrame
        JFrame frame = new JFrame("Tamil Parse Tree Viewer (Days & Months Aware)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Convert ruleNames to a List as required by TreeViewer
        List<String> rules = Arrays.asList(ruleNames);

        // Create ANTLR TreeViewer (this is part of antlr runtime jar)
        TreeViewer view = new TreeViewer(rules, tree);
        view.setScale(1.0); // scale (zoom) factor; change as needed

        // Put TreeViewer in a scroll pane (TreeViewer is a JComponent)
        JScrollPane scroll = new JScrollPane(view);
        scroll.setPreferredSize(new Dimension(900, 700));

        // Add some controls: zoom in/out buttons
        JPanel controlPanel = new JPanel();
        JButton zoomIn = new JButton("Zoom In");
        JButton zoomOut = new JButton("Zoom Out");
        JButton fit = new JButton("Reset Zoom");
        controlPanel.add(zoomIn);
        controlPanel.add(zoomOut);
        controlPanel.add(fit);

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

        fit.addActionListener(e -> {
            view.setScale(1.0);
            view.revalidate();
            view.repaint();
        });

        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(scroll, BorderLayout.CENTER);

        // Basic menu to export textual parse tree (optional)
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem printTree = new JMenuItem("Print textual tree to console");
        printTree.addActionListener(e -> System.out.println(tree.toStringTree()));
        menu.add(printTree);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
