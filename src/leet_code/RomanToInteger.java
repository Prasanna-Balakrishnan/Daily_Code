package leet_code;
import java.util.*;
class Convert{
	public int getValue(char s) {
		switch(s) {
		case 'I' :return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        default: return 1000;
		}
	}
	
	public int romanToInt(String s) {
		int total = 0;
		for(int i=0;i<s.length();i++) {
			int val = getValue(s.charAt(i));
			if(i<s.length()-1 && val<getValue(s.charAt(i+1))) {
				total-=val;
				
			}
			else {
				total+=val;
			}
		}
		return total;
		
	}
}
public class RomanToInteger {
	public static void main(String[] args) {
	String s = "III";
	Convert con = new Convert();
	int val = con.romanToInt(s);
	System.out.println(val);
	
	}

}
