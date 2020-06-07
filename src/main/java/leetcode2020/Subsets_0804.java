package leetcode2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-06 14:39
 */
public class Subsets_0804 {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        //Arrays.sort(nums);
        result.add(new ArrayList<Integer>());
        backtrack(nums,0,list);
        return result;
    }

    private void backtrack(int[] nums, int i, List<Integer> list) {
        for (int j = i; j < nums.length; j++) {
            list.add(nums[j]);
            result.add(new ArrayList<>(list));
            backtrack(nums, j + 1, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Subsets_0804 s = new Subsets_0804();
        System.out.println(s.subsets(nums));
    }
}
