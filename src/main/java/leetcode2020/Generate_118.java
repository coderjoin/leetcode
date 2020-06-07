package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 描述：杨辉三角
 *         两层循环
 * @author coderjoin
 * @date 2020-05-30 14:07
 */
public class Generate_118 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> tmp = result.get(i - 1);
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for (int j = 1; j < i; j++) {
                next.add(tmp.get(j - 1) + tmp.get(j));
            }
            next.add(1);
            result.add(next);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }
}
