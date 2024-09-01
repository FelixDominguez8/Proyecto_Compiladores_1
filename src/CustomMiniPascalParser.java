import org.antlr.v4.runtime.*;

public class CustomMiniPascalParser extends BaseErrorListener {
    // Indicador de error
    private static boolean hasError = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        // Crear el mensaje de error
        String error = "Error en la línea " + line + ":" + charPositionInLine + " - " + msg;
        System.err.println(error);

        // Establecer el indicador de error
        hasError = true;
    }

    // Método para verificar si se ha producido un error
    public static boolean hasError() {
        return hasError;
    }

    // Método para resetear el indicador de error
    public static void resetError() {
        hasError = false;
    }
}
