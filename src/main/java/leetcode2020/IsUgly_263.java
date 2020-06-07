package leetcode2020;

/**
 *
 * 描述：丑数
 *
 *
 * @author coderjoin
 * @date 2020-05-30 21:31
 */
public class IsUgly_263 {

    public static boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }

            while (num % 2 == 0) {
                num /= 2;
            }
            while (num % 3 == 0) {
                num /= 3;
            }
            while (num % 5 == 0) {
                num /= 5;
            }
        if (num == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(isUgly(n));
    }

}
