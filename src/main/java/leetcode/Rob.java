package leetcode;

/**
 * @author qiaoying
 * @date 2019-03-18 19:44
 */
public class Rob {
    public int rob(int[] nums) {
        int resultA = 0;
        int resultB = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                resultA = Math.max(resultA + nums[i], resultB);
            } else {
                resultB = Math.max(resultB + nums[i], resultA);
            }
        }
        return resultA > resultB ? resultA : resultB;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Rob rob = new Rob();
        System.out.println(rob.rob(nums));
    }
}
