package leet_code;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int j = 0;

        // Move non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining positions with 0
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        // Print array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}