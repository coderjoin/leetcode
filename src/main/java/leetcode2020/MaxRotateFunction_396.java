package leetcode2020;

/**
 *
 * 描述：旋转函数
 *      通项公式法
 * @author coderjoin
 * @date 2020-05-29 15:54
 */
public class MaxRotateFunction_396 {

    public static int maxRotateFunction(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int sum = 0;
        int base = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            base += i * A[i];
        }
        int max = base;
        for (int i = 1; i < n; i++) {
            base = base + sum - n*A[n - i];
            if (max < base) {
                max = base;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = {4,3,2,6};
        System.out.println(maxRotateFunction(A));
    }
}
