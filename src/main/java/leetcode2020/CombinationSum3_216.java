package leetcode2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author coderjoin
 * @date 2020-06-09 21:07
 */
public class CombinationSum3_216 {
    int k = 0;
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        backtrack(new Stack<>(),0, 1, n);
        return res;
    }

    private void backtrack(Stack<Integer> tmp, int height, int start, int total) {
        if (height > k) {
            return;
        }

        if (height == k && total == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for (int i = start; i < 10 && total - i >= 0; i++) {
            tmp.push(i);
            backtrack(tmp, height + 1, i + 1, total - i);
            tmp.pop();
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int n = 7;
        CombinationSum3_216 c = new CombinationSum3_216();
        System.out.println(c.combinationSum3(k,n));
    }
}
