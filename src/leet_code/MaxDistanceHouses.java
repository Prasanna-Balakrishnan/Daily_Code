package leet_code;
import java.util.*;

public class MaxDistanceHouses {
    public static int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                maxDist = i;
                break;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDist = Math.max(maxDist, (n - 1 - i));
                break;
            }
        }
        return maxDist;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();
        
        int[] colors = new int[n];
        System.out.println("Enter colors:");
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }

        int result = maxDistance(colors);
        System.out.println("Maximum distance: " + result);
        sc.close();
    }
}
