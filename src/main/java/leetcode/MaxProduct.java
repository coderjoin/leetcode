package leetcode;

/**
 * @author qiaoying
 * @date 2019-03-16 13:33
 */
public class MaxProduct {

    public int maxProduct(int[] nums) {
//        if (nums == null || nums.length < 1) {
//            return 0;
//        }
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            int tmp = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                max = Math.max(max,tmp);
//                tmp *= nums[j];
//            }
//            max = Math.max(max,tmp);
//        }
//        return max;

        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        max[0] = nums[0];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max[i] = Math.max(Math.max(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
            min[i] = Math.min(Math.min(max[i - 1] * nums[i], min[i - 1] * nums[i]), nums[i]);
        }
        int result = max[0];
        for (int i = 0; i < max.length; i++) {
            if (max[i] > result) {
                result = max[i];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        MaxProduct maxProduct = new MaxProduct();
        System.out.println(maxProduct.maxProduct(nums));
    }
}
