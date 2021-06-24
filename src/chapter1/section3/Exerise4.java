package chapter1.section3;

import edu.princeton.cs.algs4.Stack;

public class Exerise4 {
    public static void main(String[] args) {
        String[] strings = {"[", "(", ")", "]", "{", "}", "{", "[", "(", ")", "(", ")", "]", "(", ")", "}"};
        String[] strings1 = {"[","(","]",")"};
        System.out.println(isParent(strings));
        System.out.println(isParent(strings1));

    }

    private static boolean isParent(String[] strings) {
        Stack<String> stringStack = new Stack<>();
        for (String symbol : strings) {
            if ("[".equals(symbol) || "(".equals(symbol) || "{".equals(symbol)) {
                stringStack.push(symbol);
            } else if("]".equals(symbol)) {
                if(stringStack.isEmpty() || !stringStack.pop().equals("[")) {
                    return false;
                }
            } else if("}".equals(symbol)) {
                if(stringStack.isEmpty() || !stringStack.pop().equals("{")) {
                    return false;
                }
            }else if(")".equals(symbol)) {
                if(stringStack.isEmpty() || !stringStack.pop().equals("(")) {
                    return false;
                }
            }
        }
        return true;
    }
}
