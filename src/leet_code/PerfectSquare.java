package leet_code;

import java.util.Scanner;
public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while (left <= right) {
            long mid = (left + right) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPerfectSquare(num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
