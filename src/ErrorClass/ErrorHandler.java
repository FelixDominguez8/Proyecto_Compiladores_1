package ErrorClass;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {
    private final List<String> errores;

    public ErrorHandler() {
        this.errores = new ArrayList<>();
    }

    public void agregarError(String error) {
        errores.add(error);
    }

    public List<String> getErrores() {
        return errores;
    }

    public String imprimirErrores() {
        String errore = "";
        for (String error : errores) {
            errore += error + "\n";
        }
        return errore;
    }
}
