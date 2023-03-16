package BasicPrograms;

import java.util.Stack;

public class PostfixNotation {
    public static double evaluate(String expr) {
        String[] tokens = expr.split(" ");
        //push into stack
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-")) {
                //pop previous two items
                double op2 = stack.pop();
                double op1 = stack.pop();
                //calculate the expression, push it back to the stack
                switch (token) {
                    case "*":
                        stack.push(op1 * op2);
                        break;
                    case "/":
                        stack.push(op1 / op2);
                        break;
                    case "+":
                        stack.push(op1 + op2);
                        break;
                    case "-":
                        stack.push(op1 - op2);
                        break;
                }
            } else {
                Double value = Double.parseDouble(token);
                stack.push(value);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "1 2 3 * +";
        System.out.println(evaluate(expr));
    }
}
