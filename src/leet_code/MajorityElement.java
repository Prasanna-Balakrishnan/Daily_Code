package leet_code;
import java.util.*;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int l1 = nums.length;
        int x = l1 / 2;
        for (int i = 0; i < l1; i++) {
            int count = 1;

            for (int j = i + 1; j < l1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > x) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);
        sc.close();
    }
}