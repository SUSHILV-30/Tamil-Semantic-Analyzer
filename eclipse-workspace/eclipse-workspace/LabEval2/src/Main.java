import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Read input file 
        	CharStream input = CharStreams.fromFileName("input");


            // Create lexer and parser generated from Expression.g4
            helloLexer lexer = new helloLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            helloParser parser = new helloParser(tokens);

            // Parse using start rule
            helloParser.StartContext tree = parser.start();

            // Print result (already printed inside grammar actions)
            System.out.println("Finished parsing.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}