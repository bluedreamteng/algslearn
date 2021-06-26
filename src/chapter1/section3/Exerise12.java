package chapter1.section3;


import edu.princeton.cs.algs4.Stack;

public class Exerise12 {

    public static void main(String[] args) {
        Stack<String> strings  = new Stack<>();
        strings.push("1");
        strings.push("2");
        strings.push("3");

        Stack<String> newStrings = copy(strings);
        System.out.print(strings);
        System.out.println();
        System.out.print(newStrings);
    }


    private static Stack<String> copy(Stack<String> stack) {
        Stack<String> newStack = new Stack<>();
        Stack<String> result = new Stack<>();
        for(String item:stack) {
            newStack.push(item);
        }

        for(String item:newStack) {
            result.push(item);
        }
        return result;
    }
}
