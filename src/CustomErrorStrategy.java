import org.antlr.v4.runtime.*;

public class CustomErrorStrategy extends DefaultErrorStrategy {
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        // Permitir que el parser continúe después de un error
        // No se lanza ninguna excepción aquí
        recognizer.notifyErrorListeners(e.getOffendingToken(), "Error de análisis", e);
    }

    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        // En lugar de detenerse, se maneja la recuperación
        return recognizer.getTokenStream().LT(1); // O retorna el token actual
    }

    @Override
    public void sync(Parser recognizer) {
        // No hacer nada, permitir que el parser continúe
    }
}
