package leetcode2020;

import java.util.HashMap;

/**
 * @author coderjoin
 * @date 2020-06-04 11:25
 */
public class CheckSubarraySum_523 {

    public static boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0) {
                sum = sum % k;
            }
            if (hashMap.containsKey(sum)) {
                if (i - hashMap.get(sum) > 1) {
                    return true;
                }
            } else {
                hashMap.put(sum, i);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums,k));
    }
}
