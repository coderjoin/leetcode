package leetcode2020;

import java.util.HashMap;

/**
 * 描述：两数之和  哈希表
 * @author coderjoin
 * @date 2020-05-25 18:50
 */
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] {map.get(comp), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("false");
    }

    public static void main(String[] args) {
        int[] nums = {1,2,4,5,7};
        int target = 6;

    }
}
