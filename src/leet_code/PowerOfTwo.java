package leet_code;

import java.util.Scanner;

public class PowerOfTwo {
	public static boolean check(int n) {
		if(n==1) {
			return true;
		}
		if(n==0) {
			return false;
		}
		while(n%2==0) {
			n=n/2;
		}
		return n==1;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Num:");
		int n=sc.nextInt();
		boolean k = check(n);
		if(k) {
			System.out.println("Power Of Two!");
		}
		else {
			System.out.println("Not Power Of Two!");

		}
	}
}
