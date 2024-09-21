import org.antlr.v4.runtime.*;

public class CustomErrorLexer extends BaseErrorListener{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String traducido = msg;
        traducido = traducido.replace("token recognition error at:","error reconociendo el token:");
        if(traducido.contains("nend.'")) {
            traducido = "cadena o comentario no cerrado correctamente";
        }
        String mensaje = "Error Lexico en la línea " + line + ":" + charPositionInLine + " - " + traducido;
        System.err.println(mensaje);
    }
}
