package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-02 10:19
 */
public class IsPowerOfThree_326 {

    public static boolean isPowerOfThree(int n) {
        boolean result = true;
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;

        }

        if (n == 1) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
}
