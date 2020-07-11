package leetcode2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-22 19:39
 */
public class PondSizes_1619 {

    public int[] pondSizes(int[][] land) {
        List<Integer> result = new ArrayList<>();
        int tmp;

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                tmp = helper(land,i,j);
                if (tmp != 0) {
                    result.add(tmp);
                }
            }
        }

        int[] res = new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }
        Arrays.sort(res);

        return res;
    }

    private int helper(int[][] land, int i, int j) {
        int num = 0;
        if (i < 0 || j < 0 || i >= land.length || j >= land[0].length
        || land[i][j] != 0) {
            return num;
        }
        num++;
        land[i][j] = -1;
        num += helper(land, i + 1, j);
        num += helper(land, i - 1, j);
        num += helper(land, i, j + 1);
        num += helper(land, i, j - 1);
        num += helper(land, i + 1, j + 1);
        num += helper(land, i + 1, j - 1);
        num += helper(land, i - 1, j + 1);
        num += helper(land, i - 1, j - 1);

        return num;
    }

    public static void main(String[] args) {
        int[][] land = {{0,2,1,0},
                        {0,1,0,1},
                        {1,1,0,1},
                        {0,1,0,1}};
        PondSizes_1619 p = new PondSizes_1619();
        int[] result = p.pondSizes(land);
        for (int i:result
             ) {
            System.out.println(i);
        }
    }

}
