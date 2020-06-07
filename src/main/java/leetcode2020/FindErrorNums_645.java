package leetcode2020;

import java.util.Arrays;

/**
 * @author coderjoin
 * @date 2020-06-01 11:55
 */
public class FindErrorNums_645 {

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                dup = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
        }
        return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};

    }

    public static void main(String[] args) {
        int[] nums = {3,2,2};
        System.out.println(findErrorNums(nums));
    }
}
