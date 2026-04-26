package leet_code;
import java.math.BigInteger;

public class BinaryAddition {
    public int checkBinary(char c){
        if(c == '1') return 1;
        return 0;
    }
    public String addBinary(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();

        BigInteger result1 = BigInteger.ZERO;
        BigInteger result2 = BigInteger.ZERO;
        for(int i = 0; i < l1; i++){
            int bit = checkBinary(a.charAt(i));
            if(bit == 1){
                result1 = result1.add(BigInteger.valueOf(2).pow(l1 - 1 - i));
            }
        }

        for(int i = 0; i < l2; i++){
            int bit = checkBinary(b.charAt(i));
            if(bit == 1){
                result2 = result2.add(BigInteger.valueOf(2).pow(l2 - 1 - i));
            }
        }
        
        BigInteger total = result1.add(result2);
        if(total.equals(BigInteger.ZERO)) return "0";

        
        StringBuilder ans = new StringBuilder();
        while(total.compareTo(BigInteger.ZERO) > 0){
            ans.append(total.mod(BigInteger.valueOf(2)));
            total = total.divide(BigInteger.valueOf(2));
        }

        return ans.reverse().toString();
    }
    
    public static void main(String[] args) {
        BinaryAddition obj = new BinaryAddition();
        String a = "1010";
        String b = "1011";

        String result = obj.addBinary(a, b);

        System.out.println("Binary A: " + a);
        System.out.println("Binary B: " + b);
        System.out.println("Sum: " + result);
    }
}
