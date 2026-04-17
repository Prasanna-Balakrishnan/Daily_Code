package leet_code;
import java.util.*;
class SolutionCheck {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
public class ValidParanthesis {
    public static void main(String[] args) {
        SolutionCheck sol = new SolutionCheck();
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";
        String s5 = "([)]";
        System.out.println(s1 + " -> " + sol.isValid(s1));
        System.out.println(s2 + " -> " + sol.isValid(s2));
        System.out.println(s3 + " -> " + sol.isValid(s3));
        System.out.println(s4 + " -> " + sol.isValid(s4));
        System.out.println(s5 + " -> " + sol.isValid(s5));
    }
}
