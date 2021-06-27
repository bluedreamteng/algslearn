package chapter1.section3;

import java.nio.file.NotDirectoryException;

public class Exerise19 {
    public static void main(String[] args) {

    }
}


class LinkedList {
    class Node {
        private String item;
        private Node next;
    }

    int size;
    Node first;

    public LinkedList(int size) {
        this.size = 0;
    }

    public void add(String item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;
        if (first == null) {
            first = newNode;
        } else {
            //找出最后一个节点
            Node current;
            for (current = first; current.next != null; current = current.next) ;
            current.next = newNode;
        }
        size++;
    }

    public void deleteLastNode() {
        if (isEmpty()) {
            throw new RuntimeException("this list is empty");
        }

        if (size == 1) {
            first = null;
        }
        //找到倒数第二个节点
        Node current = first;
        for (int i = 0; i < size - 2; i++) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    /**
     * 删除k位置的元素
     *
     * @param k
     */
    public void delete(int k) {
        if (k > size) {
            throw new RuntimeException("the element is not exist");
        }
        if (k == 1) {
            first = null;
        }
        Node current = first;
        for (int i = 0; i < k - 2; i++) {
            current = current.next;
        }
        current.next = null;
        size--;

    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
