package self;

import java.util.Arrays;

/**
 * @author coderjoin
 * @date 2019-06-08 22:12
 */
public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                int tmp = nums[i + 1];
                nums[i + 1] = nums[i];
                nums[i] = tmp;
                flag = false;
            }
        }
        if (flag) {
            Arrays.sort(nums);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
