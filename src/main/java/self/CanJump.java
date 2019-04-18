package self;

import java.util.Arrays;

/**
 * @author qiaoying
 * @date 2019-04-17 16:45
 */
public class CanJump {
    public static boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 0);
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i - 1]) - 1;
            if (dp[i] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
