package chapter1.section3;

public class Exerise3 {
    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1, 0, 9, 8, 7, 6, 5};
        int[] b = {4, 6, 8, 7, 5, 3, 2, 9, 0, 1};
        int[] c = {2, 5, 6, 7, 4, 8, 9, 3, 1, 0};
        int[] d = {4, 3, 2, 1, 0, 5, 6, 7, 8, 9};
        int[] e = {1, 2, 3, 4, 5, 6, 9, 8, 7, 0};
        int[] f = {0, 4, 6, 5, 3, 8, 1, 7, 2, 9};
        int[] g = {1, 4, 7, 9, 8, 6, 5, 3, 0, 2};
        int[] h = {2, 1, 4, 3, 6, 5, 8, 7, 9, 0};

        System.out.println("a " + isTrueStack(a));
        System.out.println("b " + isTrueStack(b));
        System.out.println("c " + isTrueStack(c));
        System.out.println("d " + isTrueStack(d));
        System.out.println("e " + isTrueStack(e));
        System.out.println("f " + isTrueStack(f));
        System.out.println("g " + isTrueStack(g));
        System.out.println("h " + isTrueStack(h));


    }

    private static boolean isTrueStack(int[] ints) {
        //分成n-2个三数数组
        for (int i = 0; i < ints.length - 2; i++) {
            int a = ints[i];
            int b = ints[i + 1];
            int c = ints[i + 2];
            if ((a > b && a > c) && (b < a && b < c)) {
                return false;
            }
        }
        return true;
    }
}
