package ErrorClass;

import org.antlr.v4.runtime.*;

public class CustomErrorParser extends BaseErrorListener {
    private final ErrorHandler errorHandler;

    public CustomErrorParser(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String traducido = msg.replace("no viable alternative at input", "no habia alguna alternativa viable en la entrada")
                .replace("extraneous input", "entrada extraña")
                .replace("expecting", "se esperaba")
                .replace("missing", "falta")
                .replace("mismatched input", "no coincide la entrada")
                .replace("at", "en")
                .replace("{'function', 'procedure', 'begin', 'const', 'var'}", "{'begin', 'const', 'var'}");
        String mensaje = "Error Sintactico en la línea " + line + ":" + charPositionInLine + " - " + traducido;
        errorHandler.agregarError(mensaje);
    }
}
