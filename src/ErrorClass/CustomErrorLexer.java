package ErrorClass;

import org.antlr.v4.runtime.*;

public class CustomErrorLexer extends BaseErrorListener {
    private final ErrorHandler errorHandler;

    public CustomErrorLexer(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String traducido = msg.replace("token recognition error at:", "error reconociendo el token:");
        if (traducido.contains("\\r")) {
            traducido = "cadena no cerrada";
        }
        String mensaje = "Error Lexico en la línea " + line + ":" + charPositionInLine + " - " + traducido;
        errorHandler.agregarError(mensaje);
    }
}
