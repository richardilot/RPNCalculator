package saxion.richieilot;

public interface Operation {
    boolean isBinary();
    String getOperator();
    String getDescription();
    double execute(double... operands);
}
