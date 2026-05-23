package leet_code;

public class SortedAndRotated {

    public static boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Compare current element with next element
            // % n helps compare last element with first element
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // Valid only if break count is 0 or 1
        return count <= 1;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};

        System.out.println(check(nums1)); // true
        System.out.println(check(nums2)); // false
    }
}