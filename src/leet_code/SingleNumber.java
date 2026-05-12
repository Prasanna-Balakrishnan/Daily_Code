package leet_code;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int l1 = nums.length;

        for (int i = 0; i < l1; i++) {
            int count = 0;

            for (int j = 0; j < l1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};

        System.out.println(singleNumber(nums));
    }
}