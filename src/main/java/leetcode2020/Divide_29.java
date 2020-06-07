package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-01 20:03
 */
public class Divide_29 {

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean k = (dividend > 0 && divisor > 0) ||
                (dividend < 0 && divisor < 0);
        int result = 0;
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        while (dividend <= divisor) {
            int tmp = divisor;
            int c = 1;
            while (dividend - tmp <= tmp) {
                tmp = tmp << 1;
                c = c << 1;
            }
            dividend -= tmp;
            result += c;
        }
        return k?result:-result;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        System.out.println(divide(dividend,divisor));
    }
}
