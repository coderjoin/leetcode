package leetcode2020;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 描述：找到所有数组中消失的数字
 *
 * @author coderjoin
 * @date 2020-05-26 10:29
 */
public class FindDisappearedNumbers_448 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], true);
        }
        List<Integer> result = new LinkedList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!hashMap.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

    }
}
