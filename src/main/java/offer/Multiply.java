package offer;

/**
 * @author qiaoying
 * @date 2019-03-09 21:11
 */
public class Multiply {

    public int[] multiply(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        }
        int length = A.length;
        int[] arr1 = new int[length];
        int[] arr2 = new int[length];
        arr1[0] = 1;
        arr2[length - 1] = 1;
        for (int i = 1; i < length; i++) {
            arr1[i] = arr1[i - 1] * A[i - 1];
            arr2[length - 1 - i] = arr2[length - i] * A[length - i];
        }
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = arr1[i] * arr2[i];
        }
        return res;
    }

    public static void main(String[] args) {

    }

}
