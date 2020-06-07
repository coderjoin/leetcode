package leetcode2020;

import java.util.TreeSet;

/**
 * @author coderjoin
 * @date 2020-06-04 15:56
 */
public class ContainsNearbyAlmostDuplicate_220 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {

            Integer s = set.ceiling(nums[i]);
            if (s != null && s <= nums[i] + t) return true;


            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] <= g + t) return true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {1,5,9,1,5,9};
        int k = 2;
        int t = 3;
        System.out.println(containsNearbyAlmostDuplicate(nums,k,t));
    }
}
