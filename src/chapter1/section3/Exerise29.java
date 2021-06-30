package chapter1.section3;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/**
 * @author ztf
 */
public class Exerise29 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");

        for (String item : queue) {
            StdOut.println(item);
        }
    }

}

class Queue implements Iterable<String> {
    private Node last;

    public void enqueue(String item) {
        Node newNode = new Node();
        newNode.item = item;
        if (last == null) {
            last = newNode;
            last.next = last;
        }
        else {
            Node oldLast = last;
            last = newNode;
            last.next = oldLast.next;
            oldLast.next = last;
        }
    }

    public String dequeue() {
        if (last == null) {
            throw new RuntimeException("the queue is empty");
        }
        Node first = last.next;
        String item = first.item;
        if (first == last) {
            last = null;
        }
        else {
            last.next = first.next;
        }
        return item;
    }

    public int size() {
        if (last == null) {
            return 0;
        }
        int size = 1;
        Node current = last.next;
        while (current != last) {
            size++;
            current = current.next;
        }
        return size;
    }

    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public Iterator<String> iterator() {
        return new QueueIterator();
    }

    class QueueIterator implements Iterator<String> {

        int count = 0;
        int size = size();
        private Node current;

        public QueueIterator() {
            if (last == null || size == 1) {
                current = last;
            }
            else {
                current = last.next;
            }
        }

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public String next() {
            String item = current.item;
            current = current.next;
            count++;
            return item;
        }
    }
}
