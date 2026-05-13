package leet_code;
import java.util.Scanner;

public class BaseSeven {

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        String result = "";
        while (num > 0) {
            int remainder = num % 7;
            result = remainder + result;
            num = num / 7;
        }
        if (negative) {
            result = "-" + result;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String answer = convertToBase7(num);
        System.out.println("Base 7 value: " + answer);
        sc.close();
    }
}