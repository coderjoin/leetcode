package self;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-04-21 14:11
 */
public class Permute {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, 0);

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

    private void swap(int[] nums,int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Permute permute = new Permute();
        System.out.println(permute.permute(nums));
    }
}
