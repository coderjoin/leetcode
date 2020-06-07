package leetcode2020;

import java.util.Arrays;

/**
 * @author coderjoin
 * @date 2020-06-03 09:11
 */
public class HeightChecker_1051 {

    public static int heightChecker(int[] heights) {
        int[] array = heights.clone();
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (array[i] != heights[i]) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
