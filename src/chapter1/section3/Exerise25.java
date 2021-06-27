package chapter1.section3;

public class Exerise25 {
    public static void insertAfter(Node node1,Node node2) {
        if(node1 == null || node2 == null) {
            //do nothing
        } else {
            Node oldNode1Next = node1.next;
            //找到node2末尾节点
            Node node2Last = node2;
            while (node2Last.next != null) {
                node2Last = node2Last.next;
            }
            node2Last.next = oldNode1Next;
            node1.next = node2;
        }
    }
}
