package chapter1.section3;

public class Exerise21 {

    public static boolean find(Node first, String key) {
        Node current = first;

        while (current != null) {
            if(key.equals(current.item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
