package leetcode2020;

import java.util.HashMap;

/**
 * @author coderjoin
 * @date 2020-07-01 14:30
 */
public class RepeatedNTimes_961 {

    public int repeatedNTimes(int[] A) {
        int len = A.length;
        HashMap<Integer, Integer> map  = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(A[i],map.getOrDefault(A[i],0) + 1);
            if (map.get(A[i]) == len / 2) {
                return A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,3};
        RepeatedNTimes_961 r = new RepeatedNTimes_961();
        System.out.println(r.repeatedNTimes(A));
    }
}
