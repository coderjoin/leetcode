package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-13 17:25
 */
public class CreateTargetArray_1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }

        int[] result  = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = list.get(i);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        CreateTargetArray_1389 c = new CreateTargetArray_1389();
        System.out.println(c.createTargetArray(nums,index));
    }

}
