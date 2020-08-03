package saxion.richieilot;

public class Addition implements Operation{

    @Override
    public boolean isBinary() {
        return true;
    }

    @Override
    public String getOperator() {
        return "+";
    }

    @Override
    public String getDescription() {
        return "performs addition of two operands";
    }

    @Override
    public double execute(double... operands) {
        var result = 0.0;
        for (double operand :
                operands) {
            result = result + operand;
        }
        return result;
    }
}
