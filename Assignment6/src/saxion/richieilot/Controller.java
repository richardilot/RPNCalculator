package saxion.richieilot;

public class Controller {
    Calculator calc;
    Parser parser;
    View view;
    Input input;

    public Controller(Calculator calc, Parser parser, View view, Input input) {
        this.calc = calc;
        this.parser = parser;
        this.view = view;
        this.input = input;
    }

    @SuppressWarnings("InfiniteLoopStatement")
    void run() {
        this.view.showMenu();
        var userInput = input.getInput();

        try {
            while (true) {
                input.hasInput();
                userInput = input.getInput();

                if(userInput.equals("q")){
                    view.showResult("q");
                    throw new ExitProgram();
                }
                else if(userInput.equals("h")){
                    view.showOptions(calc.getOperationsInfo());
                }
                else{
                    if(parser.canParse(userInput)){
                        var parsedUserInput = parser.parse(userInput);
                        var result = calc.execute(parsedUserInput);
                        view.showResult(String.valueOf(result));
                    }
                }
            }
        } catch (ExitProgram e) {
            e.getMessage();
        }
    }
}
