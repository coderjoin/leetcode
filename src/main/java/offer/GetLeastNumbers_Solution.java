package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author qiaoying
 * @date 2019-03-03 13:24
 */
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length) {
            return list;
        }

        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] put = {4,5,1,6,2,7,3,8};
        int k = 10;
        GetLeastNumbers_Solution getLeastNumbers_solution = new GetLeastNumbers_Solution();
        System.out.println(getLeastNumbers_solution.GetLeastNumbers_Solution(put, k));
    }
}
