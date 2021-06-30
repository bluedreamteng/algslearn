package chapter1.section3;

import edu.princeton.cs.algs4.StdOut;

public class Exerise27 {
    public static int max(Node first) {
        if (first == null) {
            return 0;
        }
        int max = Integer.parseInt(first.item);
        Node current = first.next;
        while (current != null) {
            String item = current.item;
            int currentNum = Integer.parseInt(item);
            if (currentNum >= max) {
                max = currentNum;
            }
            current = current.next;
        }
        return max;
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.item = "4";
        Node twoNode = new Node();
        twoNode.item = "3";
        node.next = twoNode;
        StdOut.println(max(node));
    }
}
