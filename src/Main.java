import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import Parser.*;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream is = System.in;
            File selectedFile = chooseFile();
            if (selectedFile != null) {
                try {
                    is = new FileInputStream(selectedFile);
                    System.out.println("Archivo encontrado: " + selectedFile.getAbsolutePath());
                } catch (Exception e) {
                    System.err.println("No se pudo abrir el archivo: " + e.getMessage());
                }
            } else {
                System.out.println("No se seleccionó ningún archivo.");
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

    private static File chooseFile() {
        String raizProyecto = System.getProperty("user.dir");
        JFileChooser fileChooser = new JFileChooser(new File(raizProyecto));
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            if (selectedFile.exists() && !selectedFile.isDirectory()) {
                return selectedFile;
            } else {
                System.err.println("El archivo no existe o es un directorio.");
                return null;
            }
        } else {
            System.out.println("El usuario canceló la selección del archivo.");
            return null;
        }
    }
}
