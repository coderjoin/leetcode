package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-08 12:05
 */
public class DeleteAndEarn_740 {

    public static int deleteAndEarn(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int max = nums[0];
        for (int i = 0; i < len; i++) {
            if (max < nums[i]) {
                max = nums[i];

            }
            max++;
        }

        int[] arr = new int[max];
        int[] dp = new int[max];

        for (int i = 0; i < len; i++) {
            arr[nums[i]]++;
        }
        dp[1] = arr[1];
        for (int i = 2; i < max; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i] * i, dp[i - 1]);
        }
        return dp[max - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 4};
        System.out.println(deleteAndEarn(nums));
    }
}
