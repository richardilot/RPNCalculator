package saxion.richieilot;

public class Main {


    public static void main(String[] args) {
	// write your code here
        var controller = new Controller(new RPNCalculator(), new Parser(), new View(), new Input());
        controller.run();

    }
}
