package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-04 15:49
 */
public class ContainsNearbyDuplicate_219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
