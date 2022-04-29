import grammar.SetElementsGrLexer;
import grammar.SetElementsGrParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try {
            String currentDir = System.getProperty("user.dir");
            ANTLRInputStream input = new ANTLRFileStream(currentDir + "\\Compiler_jar\\prog5.txt");
            SetElementsGrLexer lexer = new SetElementsGrLexer(input);
            SetElementsGrParser parser = new SetElementsGrParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            Visitor visitor = new Visitor();
            String output = (String) visitor.visit(tree);

            FileWriter fileWriter = new FileWriter("Program.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
