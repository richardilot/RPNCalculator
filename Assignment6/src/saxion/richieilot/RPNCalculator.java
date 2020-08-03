package saxion.richieilot;

import java.util.*;

public class RPNCalculator implements Calculator {
    private final ArrayList<Operation> operations;

    public RPNCalculator() {
        this.operations = operationList();
    }

    public boolean addOperation(Operation operation){
        if(operations.contains(operation)){
            return false;
        }
        operations.add(operation);
        return true;
    }

    public boolean removeOperation(String operator){
        for (Operation operation :
                operations) {
            if(!operation.getOperator().contains(operator))
            return false;
            else
                return operations.remove(operation);
        }
        return false;
    }

    public double execute(List<String> expression) { //deque
        Deque<Double> deque = new ArrayDeque<>();
        try {
            for (String operand :
                    expression) {
                if (Check.number(operand))
                    deque.push(Double.parseDouble(operand));
                else {
                    var operation = operations.get(getOperation(operand));
                    if (deque.size() == 1) {
                        var result = operation.execute(deque.getLast());
                        deque.pop();
                        deque.addLast(result);
                    } else {
                        while (deque.size() != 1) {
                            var calculation = operation.execute(deque.getLast(), deque.getFirst());
                            deque.removeLast();
                            deque.removeLast();
                            deque.addLast(calculation);
                        }
                    }
                }
            }
        }catch (UnsupportedOperatorException e){
            System.out.println(e.getMessage());
        }
//        if(deque.size() < 1)
//            throw new ExpressionFormatException();
//        else
        System.out.println("size : " + deque.size());
            return deque.getFirst();
    }

//    public boolean supportOperation(String operator){
//        for (int i = 0; i < operations.size(); i++) {
//            if(operations.contains(operator));
//        }
//    }

    @Override
    public ArrayList<String> getOperationsInfo(){
        var getInfo = new ArrayList<String>();
        for (Operation op :
                operations) {
            getInfo.add(op.getOperator() + " - " + op.getDescription());
        }
        return getInfo;
    }

    public int getOperation(String operator){
        for (int opNum = 0; opNum < operations.size(); opNum++) {
            if(operations.get(opNum).getOperator().equals(operator)){
                return opNum;
            }
        }
        throw new UnsupportedOperatorException();
    }

    public ArrayList<Operation> operationList(){
        var opsList = new ArrayList<Operation>();
        opsList.add(new Addition());
        return opsList;
    }
//    public List<String> getOperators(){
//
//    }
}
