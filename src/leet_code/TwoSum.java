package leet_code;
class Solution{
	public int[] twoSum(int [] arr, int target) {
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if (arr[j] == target-arr[i]) {
					return new int[] {i,j};
				}
			}
		}
		return arr;
	}
}
public class TwoSum {
	public static void main(String[] args) {
		Solution sol= new Solution();
		int[] arr = {2,7,11,45};
		int[] arr1 = sol.twoSum(arr,9);
		for (int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+"\t");
		}	
	}
}
