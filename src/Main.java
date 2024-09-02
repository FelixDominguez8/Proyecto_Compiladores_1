import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import Parser.*;
public class Main {
    public static void main(String[] args) {
        try {
            String inputFile = null;
            if (args.length > 0) inputFile = args[0];
            InputStream is = System.in;
            if (inputFile != null) {
                File file = new File(inputFile);
                if (file.exists() && !file.isDirectory()) {
                    System.out.println("Archivo encontrado: " + inputFile);
                    is = new FileInputStream(file);
                } else {
                    System.err.println("El archivo no existe: " + inputFile);
                    return;
                }
            }

            CharStream input = CharStreams.fromStream(is);
            MiniPascalLexer lexer = new MiniPascalLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniPascalParser parser = new MiniPascalParser(tokens);
            ParseTree tree = parser.program();
            MiniPascalVisitor eval = new MiniPascalVisitor();
            eval.visit(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
