package self;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author qiaoying
 * @date 2019-05-03 22:46
 */
public class PermuteUnique {

    List<List<Integer>> result = new ArrayList<>();
    Set<List<Integer>> test = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        helper(nums, 0);
        test.addAll(result);
        result.clear();
        result.addAll(test);
        return result;
    }

    public void helper(int[] nums, int i) {
        if (i == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                list.add(nums[j]);
            }
            result.add(list);
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            helper(nums, i + 1);
            swap(nums, i, j);
        }


    }


    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public static void main(String[] args) {
        int[] nums = {1,1,2};
        PermuteUnique permuteUnique = new PermuteUnique();
        System.out.println(permuteUnique.permuteUnique(nums));
    }

}
