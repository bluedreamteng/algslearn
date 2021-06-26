package chapter1.section3;

import edu.princeton.cs.algs4.Stack;

public class Exerise11 {
    public static void main(String[] args) {
        String postfix = "3 4 + 5 * 6 + 9 *";
        System.out.println(EvaluatePostfix(postfix));
    }

    private static String EvaluatePostfix(String postfix) {
        String[] postfixElements = postfix.split(" ");
        Stack<String> operators = new Stack<>();
        for (String value : postfixElements) {
            if ("+".equals(value) || "-".equals(value) || "*".equals(value) || "/".equals(value)) {
                int operator1 = Integer.parseInt(operators.pop());
                int operator2 = Integer.parseInt(operators.pop());
                int result;
                if ("+".equals(value)) {
                    result = operator1 + operator2;
                }
                else if ("-".equals(value)) {
                    result = operator1 - operator2;
                }
                else if ("*".equals(value)) {
                    result = operator1 * operator2;
                }
                else  {
                    result = operator1 / operator2;
                }
                operators.push(String.valueOf(result));
            } else {
                operators.push(value);
            }
        }
        return operators.pop();
    }
}
