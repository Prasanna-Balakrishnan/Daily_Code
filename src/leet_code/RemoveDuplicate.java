package leet_code;

import java.util.*;

class SolutionDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
public class RemoveDuplicate {
    public static void main(String[] args) {
    	SolutionDuplicate obj = new SolutionDuplicate();
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int k = obj.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
