package chapter1.section3;

/**
 * @author ztf
 */
public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N = 0;

    public FixedCapacityStackOfStrings(int n) {
        a = new String[n];
    }

    void push(String item){
        a[N++] = item;
    }

    String pop() {
        return a[--N];
    }

    boolean isEmpty() {
        return N==0;
    }

    int size() {
        return N;
    }

    boolean isFull() {
        return N == a.length;
    }

    public static void main(String[] args) {
        FixedCapacityStackOfStrings fixedCapacityStackOfStrings = new FixedCapacityStackOfStrings(10);
        for (int i = 0; i < 10; i++) {
            fixedCapacityStackOfStrings.push("s");
        }
        System.out.println(fixedCapacityStackOfStrings.size());
    }

}
