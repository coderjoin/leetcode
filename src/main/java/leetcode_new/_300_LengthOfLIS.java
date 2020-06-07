package leetcode_new;

/**
 * @author qiaoying
 * @date 2019/11/12 14:43
 *
 *
 *
 * Leetcode第300题：最长递增子序列长度
 */
public class _300_LengthOfLIS {

    public static int getLengthOfLIS(int[] array) {
        int[] dp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int res = dp[0];
        for (int i = 0; i < array.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {2,1,5,3,6,4,8,9,7};
        System.out.println(getLengthOfLIS(array));
    }
}
