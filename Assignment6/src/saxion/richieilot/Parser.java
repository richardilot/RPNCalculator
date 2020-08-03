package saxion.richieilot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Parser{

//    public Parser(ArrayList<String> supportedOps){
//        Check.setSupportedOps(supportedOps);
//    }
//
//    public Parser() {
//        Check.setSupportedOps(startup());
//    }
//
//    private ArrayList<String> startup() {
//        var supportedOps = new ArrayList<String>();
//        supportedOps.add("+");
//        supportedOps.add("-");
//        supportedOps.add("*");
//        supportedOps.add("^");
//        supportedOps.add("sqrt");
//        return supportedOps;
//    }
//
//
//    public boolean canParse(String userInput) {
//
//        var list = this.parse(userInput);
//
//        int counter = 0;
//
//        try {
//            if(valence(list.get(list.size()-1)) == 0){
//                throw new ExpressionFormatException();
//            }
//            for (String token : list) {
//                counter = counter - valence(token);
//                if(!(Check.supportedOp(token)) & !Check.number(token)){
//                    throw new UnsupportedOperatorException();
//                }
//                if(counter < 0 ){
//                    throw new ExpressionFormatException();
//                }
//                counter ++;
//            }
//
//        }catch (ExpressionFormatException | IndexOutOfBoundsException e){
//            System.out.println(new ExpressionFormatException().getMessage());
//            return false;
//        }catch (UnsupportedOperatorException ne){
//            System.out.println(ne.getMessage());
//            return false;
//        }
//        return true;
//    }
//
//    private int valence(String token){
//        String operands = "+-/%*^";
//        if(Check.number(token)){
//            return 0;
//        }
//        else if(operands.contains(token)){
//            return 2;
//        }
//        else{
//            return 1;
//        }
//    }
//
//    public ArrayList<String> parse(String string){
//        StringTokenizer collection = new StringTokenizer(string);
//        var list = new ArrayList<String>();
//        while(collection.hasMoreTokens()){
//            list.add(collection.nextToken());
//        }
//        return list;
//    }

    //TODO: below is mine, every binary input is not processed.
    // a single operand input is re-printed instead.
    //{"+", "-", "*", "/", "ln", "sqrt", "sin"};

    public Parser() {
        Check.setSupportedOps();
    }

    public Parser(ArrayList<String> supportedOps) {
        Check.setSupportedOps(supportedOps);
    }


    //TODO: fix the crash when input is without space,
    // it returns "java.util.NoSuchElementException"
    public boolean canParse(String expression){
        var list = parse(expression);
        for (String token :
                list) {
            if (!Check.number(expression) && !Check.supportedOp(expression))
                return false;
            else if(list.size() == 0)
                throw new ExpressionFormatException();
            else
                return true;
        }
            return true;
    }

    //start
//    public boolean canParse(String userInput) {
//
//        var list = this.parse(userInput);
//
//        int counter = 0;
//
//        try {
//            if(valence(list.get(list.size()-1)) == 0){
//                throw new ExpressionFormatException();
//            }
//            for (String token : list) {
//                counter = counter - valence(token);
//                if(!(Check.supportedOp(token)) & !Check.number(token)){
//                    throw new UnsupportedOperatorException();
//                }
//                if(counter < 0 ){
//                    throw new ExpressionFormatException();
//                }
//                counter ++;
//            }
//
//        }catch (ExpressionFormatException | IndexOutOfBoundsException e){
//            System.out.println(new ExpressionFormatException().getMessage());
//            return false;
//        }catch (UnsupportedOperatorException ne){
//            System.out.println(ne.getMessage());
//            return false;
//        }
//        return true;
//    }
//
//    private int valence(String token){
//        String operands = "+-/%*^";
//        if(Check.number(token)){
//            return 0;
//        }
//        else if(operands.contains(token)){
//            return 2;
//        }
//        else{
//            return 1;
//        }
//    }
    //end

    public ArrayList<String> parse(String expression) {
        var parsedExpression = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(expression);
        while(tokenizer.hasMoreTokens()){
            parsedExpression.add(tokenizer.nextToken());
        }
        return parsedExpression;
    }



}
