package leetcodeTwo;
import java.util.*;

class Balloon{
	int b = 0;
	int a = 0;
	int l = 0;
	int o = 0;
	int n = 0;
	public void check(char c) {
		switch (c) {
		case 'b':
			b++;
			break;
		case 'a':
			a++;
			break;
		case 'l':
			l++;
			break;
		case 'o':
			o++;
			break;
		case 'n':
			n++;
			break;
		default:
			break;
		}
	}
	public int answer(String str) {
		int l1=str.length();
		for(int i=0;i<l1;i++) {
			check(str.charAt(i));
		}
		
		l/=2;
		o/=2;
		return Math.min(Math.min(b,a),Math.min(Math.min(l,o),n));
		
	}
}
public class NumberOfBalloons {
public static void main(String[] args) {
	String s = "loonbalxballpoon";
	Balloon b = new Balloon();
	int ans = b.answer(s);
	System.out.println("No of Balloons:"+ans);
}
}
