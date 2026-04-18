package leet_code;

class Remove {
    public int removeElement(int[] nums, int val) {
        int k = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
public class RemoveItem {
    public static void main(String[] args) {
        Remove obj = new Remove();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = obj.removeElement(nums, val);
        System.out.println("Number of elements after removal: " + result);
        System.out.print("Updated array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
