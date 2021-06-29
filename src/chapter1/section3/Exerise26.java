package chapter1.section3;

public class Exerise26 {


    public static void remove(Node first, String key) {

        //1.空链表情况
        if (first == null || key == null) {
            return;
        }
        //2.首节点符合条件情况
        while (first != null && key.equals(first.item)) {
            first = first.next;
        }

        //3.非首节点
        Node current;
        for (current = first; current != null; current = current.next) {
            Node next = current.next;
            while (next != null && key.equals(next.item)) {
                next = next.next;
            }
            current.next = next;
        }
    }
}
