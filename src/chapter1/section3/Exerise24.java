package chapter1.section3;

public class Exerise24 {
    public static void removeAfter(Node node) {
        if(node == null|| node.next == null) {
            //do nothing
        } else {
            node.next = node.next.next;
        }
    }
}
