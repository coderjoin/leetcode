package self;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author qiaoying
 * @date 2019-04-18 13:07
 */
public class LengthOfLIS {

    public static int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        int[] dp = new int[length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < length; i++) {
            int curVal = nums[i];
            for (int j = 0; j < i; j++) {
                if (curVal > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        int res = dp[0];
        for (int i = 0; i < length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }


    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] nums = new int[num];
//        for (int i = 0; i < num; i++) {
//            nums[i] = sc.nextInt();
//        }
        int[] nums = {2,1,3,2};
        Arrays.sort(nums);
        System.out.println(lengthOfLIS(nums));
    }
}
