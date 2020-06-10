package leetcode2020;

import java.util.Arrays;

/**
 * @author coderjoin
 * @date 2020-06-08 11:33
 */
public class MaxSatisfaction_1402 {

    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int ans = 0;
        int sum = 0;
        for (int i = satisfaction.length -1; i >= 0; i--) {
            sum += satisfaction[i];
            if (sum < 0) {
                break;
            }
            ans += sum;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] sat = {-1,-8,0,5,-9};
        System.out.println(maxSatisfaction(sat));
    }
}
