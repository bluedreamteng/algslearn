package chapter1.section3;

import edu.princeton.cs.algs4.Queue;

public class Exerise14 {
    public static void main(String[] args) {
        ResizingArrayQueueOfStrings queueOfStrings = new ResizingArrayQueueOfStrings();
        queueOfStrings.enqueue("1");
        System.out.println(queueOfStrings.dequeue());
    }

}

class ResizingArrayQueueOfStrings {
    private String[] items = new String[1];
    private int N = 0;

    public void enqueue(String item) {
        if (N == items.length) {
            resize(items.length * 2);
        }
        items[N++] = item;
    }

    public String dequeue() {
        String item = items[0];
        //重新排列顺序
        moveBack();
        if(N == items.length/4) {
            resize(items.length/2);
        }
        N--;
        return item;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    private void resize(int size) {
        assert size >= N;
        String[] newItems = new String[size];
        for (int i = 0; i < N; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }

    private void moveBack() {
        String[] newItems = new String[items.length];
        for (int i = 1; i < items.length; i++) {
            newItems[i-1] = items[i];
        }
        items = newItems;
    }
}