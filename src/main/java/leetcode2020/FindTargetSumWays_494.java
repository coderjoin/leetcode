package leetcode2020;

/**
 *
 * 描述： 目标和
 * @author coderjoin
 * @date 2020-05-27 15:36
 */
public class FindTargetSumWays_494 {

    int count = 0;
    public  int findTargetSumWays(int[] nums, int S) {
        helper(nums,0,0,S);
        return count;
    }

    public  void helper(int[] nums, int i, int sum, int S) {
        if (i == nums.length) {
            if (sum == S) {
                count++;
            }
        } else {
            helper(nums, i + 1, sum + nums[i], S);
            helper(nums, i + 1, sum - nums[i], S);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int S = 3;
        FindTargetSumWays_494 f = new FindTargetSumWays_494();
        System.out.println(f.findTargetSumWays(nums, S));
    }
}
