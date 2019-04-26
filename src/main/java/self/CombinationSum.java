package self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-04-26 10:03
 */
public class CombinationSum {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        ArrayList<Integer> tmp = new ArrayList<>();
        helper(candidates,target,0, tmp,result);
        return result;

    }

    public void helper(int[] candidates, int target, int n, List<Integer> tmp, List<List<Integer>> result) {
        if (target < 0) {
            return;
        } else if (target == 0){
            result.add(new ArrayList<>(tmp));
            return;
        } else {
            for (int i = n; i < candidates.length; i++) {
                tmp.add(candidates[i]);
                helper(candidates,target - candidates[i], i, tmp, result);
                tmp.remove(tmp.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(candidates, target));
    }



}
