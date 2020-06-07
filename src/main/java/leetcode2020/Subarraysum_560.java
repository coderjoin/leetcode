package leetcode2020;

import java.util.HashMap;

/**
 * 描述：和为k的子数组
 * @author coderjoin
 * @date 2020-05-25 18:03
 */
public class Subarraysum_560 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        int count = 0;
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int k = 4;

    }
}
