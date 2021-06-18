package chapter1.section2;

/**
 * @author ztf
 */
public class Exerise6 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";

        String s3 = "ACTGACG";
        String s4 = "TGACGAC";

        assert !isCircularShift1(s1, s2);
        assert isCircularShift1(s3, s4);
    }

    private static boolean isCircularShift(String s1, String s2) {
        return s1.length() == s2.length() && (s1 + s1).contains(s2);
    }

    private static boolean isCircularShift1(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            String left = s1.substring(0, i);
            String right = s1.substring(i);
            if ((right + left).equals(s2)) {
                return true;
            }
        }

        return false;
    }
}
