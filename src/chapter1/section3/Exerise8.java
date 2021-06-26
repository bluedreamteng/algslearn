package chapter1.section3;

import edu.princeton.cs.algs4.StdOut;

public class Exerise8 {
    public static void main(String[] args) {
        DoublingStackOfStrings stackOfStrings = new DoublingStackOfStrings();
        stackOfStrings.push("1");
        stackOfStrings.pop();
        stackOfStrings.push("1");
    }
}

class DoublingStackOfStrings {
    private String[] strings = new String[1];
    private int n = 0;

    public DoublingStackOfStrings() {
    }

    public void push(String item) {
        if (n == strings.length) {
            resize(strings.length * 2);
        }
        strings[n++] = item;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("the stack is empty");
        }
        String item = strings[--n];
        if (!isEmpty() && n == strings.length / 4) {
            resize(strings.length / 2);
        }
        strings[n] = null;
        return item;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    private void resize(int size) {
        assert size >= n;
        String[] newStrings = new String[size];
        for (int i = 0; i < n; i++) {
            newStrings[i] = strings[i];
        }
        strings = newStrings;
    }
}
