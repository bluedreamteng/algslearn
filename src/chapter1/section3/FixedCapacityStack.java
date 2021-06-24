package chapter1.section3;

import edu.princeton.cs.algs4.Queue;

import java.util.Iterator;

/**
 * @author ztf
 */
public class FixedCapacityStack<Item> implements Iterable<Item> {
    private Item[] a;
    private int N = 0;

    public FixedCapacityStack(int n) {
        a = (Item[]) new Object[n];
    }

    void push(Item item) {
        a[N++] = item;
    }

    Item pop() {
        return a[--N];
    }

    boolean isEmpty() {
        return N == 0;
    }

    int size() {
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {
        }
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> fixedCapacityStack = new FixedCapacityStack<>(10);
        for (int i = 0; i < 10; i++) {
            fixedCapacityStack.push("s");
        }
        System.out.println(fixedCapacityStack.size());
    }

}
