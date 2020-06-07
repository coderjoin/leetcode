package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-02 10:35
 */
public class IsPowerOfTwo_231 {

    public static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 218;
        System.out.println(isPowerOfTwo(n));
    }
}
