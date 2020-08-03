package saxion.richieilot;

import java.util.ArrayList;
import java.util.List;

public interface Calculator {
    double execute(List<String> expression);
    ArrayList<String> getOperationsInfo();
}
