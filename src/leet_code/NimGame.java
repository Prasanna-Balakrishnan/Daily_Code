package leet_code;
public class NimGame {
    public static boolean canWinNim(int n) {
        return n % 4 != 0;
    }
    public static void main(String[] args) {
        int n = 5;
        if (canWinNim(n)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
