import org.antlr.v4.runtime.*;

public class CustomErrorParser extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String traducido = msg;
        traducido = traducido.replace("no viable alternative at input", "no habia alguna alternativa viable en la entrada");
        traducido = traducido.replace("extraneous input","entrada extraña");
        traducido = traducido.replace("expecting","se esperaba");
        traducido = traducido.replace("missing","falta");
        traducido = traducido.replace("mismatched input","no coincide la entrada");
        traducido = traducido.replace("at","en");
        traducido = traducido.replace("{'end', '+', '-', '*', '/', 'mod', 'div', 'and', 'or', '=', '<>', '<', '<=', '>=', '>', ';'}","';'");
        traducido = traducido.replace("{'end', '+', '-', '*', '/', 'mod', 'div', 'and', 'or', '=', '<>', '<', '<=', '>=', '>', ';', '[', '(.', '.'}","';'");
        traducido = traducido.replace("{'length', '+', '-', 'not', 'true', 'false', '(', ')', LSTRING, NUM, IDENTIFIER}","')'");
        traducido = traducido.replace("{'length', '+', '-', 'not', 'true', 'false', '(', LSTRING, NUM, IDENTIFIER}","numero o variable");
        traducido = traducido.replace("{'+', '-', '*', '/', 'mod', 'div', 'and', 'or', '=', '<>', '<', '<=', '>=', '>', ',', ':', ')', '[', '(.', '.'}","';'");
        traducido = traducido.replace("{'end', ';', '('}",":=");
        traducido = traducido.replace("no coincide la entrada ';' se esperaba '..'","tipo de dato mal escrito");
        traducido = traducido.replace("{'+', '-', '*', '/', 'mod', 'div', 'and', 'or', '=', '<>', '<', '<=', '>=', '>', ')', '[', '(.', '.'}","{'+', '-', '*', '/', 'mod', 'div', 'and', 'or', '=', '<>', '<', '<=', '>=', '>', ';'}");
        traducido = traducido.replace("{'until', ';', '('}","'until'");
        traducido = traducido.replace("{'begin', 'if', 'else', 'for', 'repeen', 'until', 'while', ';', NUM, IDENTIFIER}","'until'");
        traducido = traducido.replace("no coincide la entrada 'else' se esperaba {'begin', 'end', 'if', 'for', 'repeen', 'while', ';', NUM, IDENTIFIER}","No se pone ';' en un if si le sigue un else");
        traducido = traducido.replace("no coincide la entrada ';' se esperaba {'begin', 'end', 'if', 'for', 'repeen', 'while', ';', NUM, IDENTIFIER}","Falta begin");
        traducido = traducido.replace("entrada extraña 'end' se esperaba {'function', 'procedure', 'begin', 'const', 'var'}","Falta begin");
        String error = "Error Sintactico en la línea " + line + ":" + charPositionInLine + " - " + traducido;
        System.err.println(error);

    }

}
