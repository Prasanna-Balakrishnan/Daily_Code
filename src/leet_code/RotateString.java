package leet_code;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        int l1 = s.length();
        int l2 = goal.length();
        if (l1 != l2) {
            return false;
        }
        String rev = s;
        for (int i = 0; i < l1; i++) {
            rev = rev.substring(1) + rev.charAt(0);
            if (rev.equals(goal)) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        RotateString obj = new RotateString ();
        System.out.println(obj.rotateString("abcde", "cdeab")); // true
        System.out.println(obj.rotateString("abcde", "abced")); // false
    }
}
