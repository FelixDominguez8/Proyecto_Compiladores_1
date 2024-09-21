import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import Parser.*;
import java.io.IOException;
import java.util.List;

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
            lexer.removeErrorListeners();
            lexer.addErrorListener(new CustomErrorLexer());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniPascalParser parser = new MiniPascalParser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new CustomErrorParser());
          
            ParseTree tree = parser.programa();


            System.out.println("Parsing completado exitosamente.");


            MiniPascalVisitor visitor = new MiniPascalVisitor();
            String result = visitor.visit(tree);

            System.out.println("Resultado del Visitor:");
            System.out.println(result);


        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
