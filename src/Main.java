import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "C:\\\\Users\\\\Lenovo I7\\\\Documents\\\\Compiladores 1\\\\Proyecto\\\\proyecto_compiI\\\\Proyecto_Compiladores1\\\\src\\\\prueba.pas";

        try {
            // Crear el lexer y el parser
            MiniPascalLexer lexer = new MiniPascalLexer(CharStreams.fromFileName(inputFilePath));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MiniPascalParser parser = new MiniPascalParser(tokens);

            // Usar el parser personalizado para manejo de errores
            parser.removeErrorListeners(); // Elimina los listeners de errores predeterminados
            CustomMiniPascalParser.resetError(); // Resetea el indicador de error
            parser.addErrorListener(new CustomMiniPascalParser()); // Agrega tu listener personalizado

            // Parsear el archivo
            ParseTree tree = parser.program(); // Inicia desde la regla `program`

            // Verificar si ocurrió un error
            if (CustomMiniPascalParser.hasError()) {
                System.err.println("Parsing detenido debido a errores.");
                return; // Termina el proceso si hay errores
            }

            // Imprimir el árbol de análisis sintáctico (opcional)
            System.out.println("Árbol de análisis sintáctico:");
            System.out.println(tree.toStringTree(parser));
            System.out.println("Parsing completado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
