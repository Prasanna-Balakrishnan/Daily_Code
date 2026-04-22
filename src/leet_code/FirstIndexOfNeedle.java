package leet_code;
import java.util.*;

public class  FirstIndexOfNeedle{
    public static int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if (l2 == 0) return 0;
        for (int i = 0; i <= l1 - l2; i++) {
            int j;
            for (j = 0; j < l2; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == l2) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        String haystack = "hello";
        String needle = "ll";
        int result =strStr(haystack, needle);
        System.out.println("Index: " + result);
    }
}
