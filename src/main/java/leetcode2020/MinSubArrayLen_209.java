package leetcode2020;

/**
 *
 * 描述： 长度最小的子数组
 *       直接暴力 n三方复杂度
 * @author coderjoin
 * @date 2020-05-27 19:08
 */
public class MinSubArrayLen_209 {

    public static int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int start = i;
            int sum = 0;
            while (start < n) {
                sum += nums[start];
                start++;
                //当前和大于等于 s 的时候结束
                if (sum >= s) {
                    min = Math.min(min, start - i);
                    break;
                }
            }
        }
        //min 是否更新，如果没有更新说明数组所有的数字和小于 s, 没有满足条件的解, 返回 0
        return min == Integer.MAX_VALUE ? 0 : min;

    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int s = 7;
        System.out.println(minSubArrayLen(s, nums));
    }
}
