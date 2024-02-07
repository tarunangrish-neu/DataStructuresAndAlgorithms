package Stack;

import java.util.Stack;

public class TwoStackAlgorithmForExpressionEvaluation {

    private static Double Evaluate(String expression){
        Stack<String>operators = new Stack<>();
        Stack<Double>values = new Stack<>();
        for(int i=0; i<expression.length(); i++){
            char currentChar = expression.charAt(i);
            if(currentChar == '(');
            else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                operators.push(String.valueOf(currentChar));
            } else if(currentChar == ')'){
                String operator = operators.pop();
                double value = values.pop();
                if (operator.equals("+")) value = value + values.pop();
                else if (operator.equals("-")) value = value - values.pop();
                else if (operator.equals("*")) value = value*values.pop();
                else if (operator.equals("/")) value = value/values.pop();
                values.push(value);
            }
            else{
                values.push(Double.parseDouble(String.valueOf(currentChar)));
            }

        }
        return values.pop();
    }

    public static void main(String args[]){
        String expression = "(1+((2+3)*(4*5)))";
        System.out.println(Evaluate(expression));

    }

}
