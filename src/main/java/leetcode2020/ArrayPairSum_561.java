package leetcode2020;

import java.util.Arrays;

/**
 * 描述数组拆分，数组最小值的和最大。
 * @author coderjoin
 * @date 2020-05-25 18:12
 */
public class ArrayPairSum_561 {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,5};
        System.out.println(arrayPairSum(nums));
    }


}
