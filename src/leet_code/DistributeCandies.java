package leet_code;

import java.util.Arrays;

public class DistributeCandies {

    public static int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int give = 1;
        int i = 0;

        while (candies > 0) {
            ans[i % num_people] += Math.min(give, candies);
            candies -= give;
            give++;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int candies = 10;
        int num_people = 3;

        int[] result = distributeCandies(candies, num_people);

        System.out.println(Arrays.toString(result));
    }
}
