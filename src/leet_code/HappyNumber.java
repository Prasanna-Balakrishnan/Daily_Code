package leet_code;

public class HappyNumber {

    public static boolean isHappy(int n) {
        for (int i = 0; i < 100; i++) {  
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            if (sum == 1) {
                return true; 
            }
            n = sum; 
        }
        return false; 
    }
    public static void main(String[] args) {
        int n = 200;
        if (isHappy(n)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }
    }
}