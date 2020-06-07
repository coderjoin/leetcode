package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 描述：杨辉三角二
 *  输出第k行
 * @author coderjoin
 * @date 2020-05-31 10:27
 */
public class GetRow_119 {

    public static List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> pre = triangle.get(i - 1);
            List<Integer> now = new ArrayList<>();
            now.add(1);
            for (int j = 1; j < i; j++) {
                now.add(pre.get(j - 1) + pre.get(j));
            }
            now.add(1);
            triangle.add(now);
        }
        return triangle.get(rowIndex);
    }

    public static void main(String[] args) {
        int k = 3;
        System.out.println(getRow(k));
    }
}
