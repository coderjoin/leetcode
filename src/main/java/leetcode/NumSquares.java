package leetcode;

import java.util.Arrays;

/**
 * @author qiaoying
 * @date 2019-03-18 20:02
 */
public class NumSquares {
    public int numSquares(int n) {
        if (n <= 0){
            return 0;
        }
        int[] array = new int[n + 1];
        Arrays.fill(array, Integer.MAX_VALUE);
        array[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                array[i] = Math.min(array[i],array[i - j * j] + 1);
            }
        }
        return array[n];
    }

    public static void main(String[] args) {
        int n = 13;
        NumSquares numSquares = new NumSquares();
        System.out.println(numSquares.numSquares(n));
    }
}

