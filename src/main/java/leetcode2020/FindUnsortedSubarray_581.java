package leetcode2020;

import java.util.Arrays;

/**
 * 描述：最短无序连续子数组
 * @author coderjoin
 * @date 2020-05-25 19:40
 */
public class FindUnsortedSubarray_581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] array = nums.clone();
        Arrays.sort(nums);
        int head = 0;
        int tail = 0;
        for (int i = 0; i < nums.length; i++) {
            if (array[i] != nums[i]) {
                head = i;
                break;
            }
        }
        for (int i = nums.length - 1; i > 0 ; i--) {
            if (array[i] != nums[i]) {
                tail = i + 1 ;
                break;
            }
        }
        return tail - head;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(findUnsortedSubarray(nums));
    }
}
