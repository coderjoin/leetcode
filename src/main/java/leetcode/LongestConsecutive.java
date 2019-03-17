package leetcode;

import java.util.HashMap;

/**
 * @author qiaoying
 * @date 2019-03-17 15:28
 */
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
       int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                continue;
            }
            int leftCount = map.getOrDefault(num - 1, 0);
            int rightCount = map.getOrDefault(num + 1, 0);
            int sum = leftCount + rightCount + 1;
            map.put(num, sum);
            map.put(num - leftCount, sum);
            map.put(num + rightCount, sum);
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestConsecutive l = new LongestConsecutive();
        System.out.println(l.longestConsecutive(nums));
    }
}
