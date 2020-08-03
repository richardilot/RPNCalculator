package saxion.richieilot;

import java.util.Scanner;

public class Input {
    private String input;

    public Input() {
        this.input = "";
    }

    public void hasInput(){
        Scanner scanner = new Scanner(System.in);
        this.input = scanner.nextLine();
    }

    public String getInput() {
        return input;
    }
}
