package leetcode2020;

import java.util.Arrays;

/**
 * @author coderjoin
 * @date 2020-06-29 11:58
 */
public class MaximumProduct_628 {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1],
                nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        MaximumProduct_628 m = new MaximumProduct_628();
        System.out.println(m.maximumProduct(nums));
    }
}
