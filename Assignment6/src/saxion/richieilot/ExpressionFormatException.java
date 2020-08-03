package saxion.richieilot;

public class ExpressionFormatException extends RuntimeException {
//not added operator exception
    public ExpressionFormatException() {
        super("Processing expression format failed!");
    }
}
