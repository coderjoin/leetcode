package leetcode2020;

/**
 *
 * 描述：全局倒置与局部倒置
 * @author coderjoin
 * @date 2020-05-27 09:52
 */
public class IsIdealPermutation_775 {

    public static boolean isIdealPermutation(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (Math.abs(A[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[] A = {1,2,0};
        System.out.println(isIdealPermutation(A));
    }
}
