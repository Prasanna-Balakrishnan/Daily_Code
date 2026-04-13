package leet_code;

import java.util.*;

class Valid {
	public String check(String[] str) {
		if (str.length == 0) {
			return "";

		}
		for (int i = 0; i < str[0].length(); i++) {
			char c = str[0].charAt(i);
			for (int j = 1; j < str.length; j++) {
				if (i >= str[j].length() || str[j].charAt(i) != c) {
					return str[0].substring(0, i);
				}
			}
		}
		return str[0];
	}

}
public class LongestCommomPrefix {
	public static void main(String[] args) {
		Valid va = new Valid();
		String [] strs= {"Hi","Hello","Hey"};
		String st= va.check(strs);
		for(int i=0;i<st.length();i++) {
			System.out.println(st.charAt(i));	
		}
	}
}
