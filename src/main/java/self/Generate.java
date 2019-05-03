package self;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-04-29 18:54
 */
public class Generate {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j <  i; j++) {
                List<Integer> pre = result.get( i - 1);
                int tmp = pre.get(j - 1) + pre.get(j);
                row.add(tmp);
            }
            if (i != 0) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }


    public static void main(String[] args) {
        int nums = 5;
        System.out.println(generate(nums));
    }
}
