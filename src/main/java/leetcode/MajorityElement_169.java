package leetcode;

import java.util.HashMap;

/**
 * @author qiaoying
 * @date 2019-03-11 22:05
 */
public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(num,count);
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
