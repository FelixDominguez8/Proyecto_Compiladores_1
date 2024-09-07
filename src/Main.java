import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import Parser.*;
import java.io.IOException;

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

            parser.removeErrorListeners();
            CustomMiniPascalParser.resetError();
            parser.addErrorListener(new CustomMiniPascalParser());

            ParseTree tree = parser.programa();

            if (CustomMiniPascalParser.hasError()) {
                System.err.println("Parsing detenido debido a errores.");
                return; // Termina el proceso si hay errores
            }

            System.out.println("Árbol de análisis sintáctico:");
            System.out.println(tree.toStringTree(parser));
            System.out.println("Parsing completado exitosamente.");
            //MiniPascalVisitor eval = new MiniPascalVisitor();
            //eval.visit(tree);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
