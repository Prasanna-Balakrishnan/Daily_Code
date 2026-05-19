package leet_code;

import java.util.Arrays;

public class GetCommon {
    public static int getCommon(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int max;
        if (l1 < l2) {
            max = l2;
        } else {
            max = l1;
        }
        int[] arr = new int[max];
        int k = 0;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {

                if (nums1[i] == nums2[j]) {
                    arr[k] = nums1[i];
                    k++;
                }
            }
        }

        if (k == 0) {
            return -1;
        }

        Arrays.sort(arr, 0, k);

        return arr[0];
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 6};
        int[] nums2 = {2, 3, 4, 5};
        int result = getCommon(nums1, nums2);
        System.out.println(result);
    }
}