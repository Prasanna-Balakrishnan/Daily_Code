package leet_code;
import java.util.*;

class Check{
	public int checklength(String s) {
		s=s.trim();
		String[] words =s.split(" "); 
		return words[words.length-1].length();
	}
}
public class LastLength {
	public static void main(String[] args) {
		Check ck = new Check();
		String s = "Hello Boi";
		int k = ck.checklength(s);
		System.out.println(k);
		
	}

}
