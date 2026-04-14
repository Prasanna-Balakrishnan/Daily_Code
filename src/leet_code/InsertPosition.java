package leet_code;

class Answer {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
public class InsertPosition {
	public static void main(String[] args) {
		Answer sol = new Answer();
		int[] arr = {2,3,4,5,6,7};
		int k= sol.searchInsert(arr, 8);
		System.out.println(k);
	}

}
