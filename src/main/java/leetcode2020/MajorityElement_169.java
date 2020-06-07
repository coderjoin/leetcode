package leetcode2020;

import java.util.HashMap;

/**
 * @author coderjoin
 * @date 2020-05-30 20:02
 */
public class MajorityElement_169 {


    public static int majorityElement(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n:nums
             ) {
            hashMap.put(n,hashMap.getOrDefault(n,0) + 1);
        }
        for (int n:hashMap.keySet()
             ) {
            if (hashMap.get(n) > nums.length/2) {
                result = n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,4};
        System.out.println(majorityElement(nums));
    }


}
