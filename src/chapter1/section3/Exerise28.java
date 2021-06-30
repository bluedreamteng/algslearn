package chapter1.section3;

public class Exerise28 {

    public static int getMax(Node current,int currentMax) {
        if(current == null) {
            return currentMax;
        }
        int num = Integer.parseInt(current.item);
        if(num > currentMax) {
            currentMax = num;
        }
        return getMax(current.next,currentMax);
    }


    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node fourth = new Node();
        first.item = "1";
        first.next = second;
        second.item = "2";
        second.next = third;
        third.item = "3";
        third.next = fourth;
        fourth.item = "4";
        fourth.next = null;

        System.out.println(getMax(first.next,1));

    }
}
