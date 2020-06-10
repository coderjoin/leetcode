package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-09 18:50
 */
public class Combine_77 {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1,new ArrayList<>(),k,n);
        return result;
    }

    private void backtrack(int i,ArrayList<Integer> list,int k,int n
    ) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
        }

        for (int j = i; j <= n; j++) {
            list.add(j);
            backtrack(j + 1, list,k,n);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        Combine_77 c = new Combine_77();
        System.out.println(c.combine(n,k));
    }
}
