package leet_code;

import java.util.Scanner;
public class AddDigits {
    public static int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = addDigits(num);
        System.out.println(result);
        sc.close();
    }
}
