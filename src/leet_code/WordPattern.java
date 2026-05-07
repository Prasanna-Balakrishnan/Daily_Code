package leet_code;

import java.util.Scanner;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = arr[i];
            for (int j = i + 1; j < pattern.length(); j++) {
                if (pattern.charAt(j) == ch) {
                    if (!arr[j].equals(word)) {
                        return false;
                    }
                }
                else {

                    if (arr[j].equals(word)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pattern: ");
        String pattern = sc.nextLine();
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        WordPattern obj = new WordPattern();
        boolean result = obj.wordPattern(pattern, s);
        System.out.println("Output: " + result);
        sc.close();
    }
}