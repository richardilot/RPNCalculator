package saxion.richieilot;

import java.util.ArrayList;

public class View {
    ArrayList<String> Options;
    public void showResult(String result){
        if(result.equals("q"))
            System.out.println("Quitting Program...");
        else if(result.equals("h"))
            showOptions(Options);
        else
            System.out.println(result);
    }

    public void showOptions(ArrayList<String> opt){
        this.Options = opt;

        System.out.println("RPNCalculator help\n" +
                "The following operations in RPN are supported:");
        for (var s :
                opt) {
            System.out.println(s);
        }
        System.out.println("\nEnter 'h' to get help.\n" +
                "Enter 'q' to exit the program.\n");
    }

    public void showMenu(){
        System.out.println("RPNCalculator\n"+
                "Enter 'h' for help and 'q' to quit\n"+
                "Enter your expression:\n");
    }
}
