package chapter1.section3;


import edu.princeton.cs.algs4.Queue;

public class Exerise15 {
    public static void main(String[] args) {
        int k = 1;
        Queue<String> queue = new Queue<>();
        for (int i = 0; i < 1; i++) {
            queue.enqueue(String.valueOf(i));
        }
        int times = queue.size() - k + 1;
        for (int i = 0; i < times-1; i++) {
            queue.dequeue();
        }
        System.out.println(queue.dequeue());

    }
}
