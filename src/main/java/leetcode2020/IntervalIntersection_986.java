package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-25 15:08
 */
public class IntervalIntersection_986 {

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            // Let's check if A[i] intersects B[j].
            // lo - the startpoint of the intersection
            // hi - the endpoint of the intersection
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi)
                ans.add(new int[]{lo, hi});

            // Remove the interval with the smallest endpoint
            if (A[i][1] < B[j][1])
                i++;
            else
                j++;
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

    }

}
