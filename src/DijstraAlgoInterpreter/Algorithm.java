package DijstraAlgoInterpreter;

import java.util.Stack;

public class Algorithm {

    private Stack<String> operatorStack;
    private Stack<Double> valueStack;

    public Algorithm() {
        this.operatorStack = new Stack<>();
        this.valueStack = new Stack<>();
    }

    public double interpreter(String expression){
        String[] expressionArray = expression.split(" ");
        for (String x: expressionArray) {
            if(x.equals("(")){
                // Do-nothing
            }
            else if(x.equals("+")){
                operatorStack.push(x);
            }
            else if(x.equals("*")){
                operatorStack.push(x);
            }
            else if(x.equals(")")){
                String operation = operatorStack.pop();
                if (operation.equals("+")){
                    valueStack.push(valueStack.pop() + valueStack.pop());
                }else if(operation.equals("*")){
                    valueStack.push(valueStack.pop() * valueStack.pop());
                }
            }
            else{
                valueStack.push(Double.parseDouble(x));
            }
        }
        return valueStack.pop();
    }

}
