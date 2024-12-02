package ErrorClass;

public class SymbolTableError extends RuntimeException {
    public SymbolTableError(String message) {
        super(message);
    }
}