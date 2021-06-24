package chapter1.section3;

import edu.princeton.cs.algs4.Stack;

public class Exerise10 {
    public static void main(String[] args) {
        String postfixExpression = "( ( ( 3 + 4 ) * 5 ) + 6 )";
        System.out.println(InfixToPostfix(postfixExpression));
    }


    private static String InfixToPostfix(String postfixExpression) {
        String[] postfixExpressions = postfixExpression.split(" ");
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();
        for (String value : postfixExpressions) {
            if ("(".equals(value)) {
                //do nothing
            }
            else if (")".equals(value)) {
                String operands2 = operands.pop();
                String operands1 = operands.pop();
                String operator = operators.pop();
                String subExpression = operands1 + " " + operands2 + " " + operator;
                operands.push(subExpression);
            }
            else if ("+".equals(value)
                    || "-".equals(value)
                    || "*".equals(value)
                    || "/".equals(value)) {
                operators.push(value);
            }
            else {
                operands.push(value);
            }
        }
        return operands.pop();
    }
}
