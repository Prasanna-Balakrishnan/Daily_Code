package leet_code;
import java.util.*;

public class PowerOfThree {
	public static boolean check(int n) {
		if(n<=0) {
			return false;
		}
		while(n%3==0) {
			n=n/3;
		}
		return n==1;	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Num:");
		int n=sc.nextInt();
		boolean k = check(n);
		if(k) {
			System.out.println("Power Of Three!");
			
		}
		else {
			System.out.println("Not Power Of Three!");

		}
	}
}
