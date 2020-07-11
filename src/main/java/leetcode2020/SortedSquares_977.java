package leetcode2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-28 20:11
 */
public class SortedSquares_977 {

    public int[] sortedSquares(int[] A) {
        List<Integer> list = new ArrayList<>();
        for (int a:A
             ) {
            list.add(a * a);
        }
        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        SortedSquares_977 s = new SortedSquares_977();
        int[] result = s.sortedSquares(A);
        for (int a : result
             ) {
            System.out.println(a);
        }
    }
}
