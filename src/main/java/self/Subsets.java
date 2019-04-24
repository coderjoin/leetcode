package self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-04-22 18:56
 */
public class Subsets {


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        result.add(new ArrayList<Integer>());
        search(nums,0,list,result);
        return result;
    }

    public void search(int[] nums, int i, List<Integer> list, List<List<Integer>> result) {
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            result.add(new ArrayList<>(list));
            search(nums, j + 1,list,result);
            list.remove(list.size() - 1);
        }

    }



    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Subsets subsets = new Subsets();
        System.out.println(subsets.subsets(nums));
    }
}
