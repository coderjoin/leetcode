package leetcode2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 描述：缺失数字
 *
 * @author coderjoin
 * @date 2020-05-30 20:13
 */
public class MissingNumber_268 {

    public static int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
}
