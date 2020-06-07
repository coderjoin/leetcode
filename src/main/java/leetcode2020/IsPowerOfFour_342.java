package leetcode2020;

/**
 *
 * 描述: 4的幂
 * @author coderjoin
 * @date 2020-05-31 12:26
 */
public class IsPowerOfFour_342 {

    public static boolean isPowerOfFour(int num) {
        return (num > 0) && (Math.log(num) / Math.log(2) % 2 == 0);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(isPowerOfFour(n));
    }
}
