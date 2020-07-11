package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-07-02 10:20
 */
public class ValidMountainArray_941 {

    public boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }

    public static void main(String[] args) {
        int[] A = {0,1,2,1,2};
        ValidMountainArray_941 v = new ValidMountainArray_941();
        System.out.println(v.validMountainArray(A));
    }
}
