package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-05-29 09:49
 */
public class Rob_198 {

    public static int rob(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum2 = Math.max(sum2 + nums[i], sum1);
            } else {
                sum1 = Math.max(sum1 + nums[i],sum2);
            }
        }
        return Math.max(sum1,sum2);
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
