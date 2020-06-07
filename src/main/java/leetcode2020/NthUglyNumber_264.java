package leetcode2020;

/**
 *
 * 描述第n个丑数
 * @author coderjoin
 * @date 2020-05-30 21:42
 */
public class NthUglyNumber_264 {

    public static int nthUglyNumber(int n) {
        int count = 0;
        int result = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (isUgly(i)) {
                count++;
                if (count == n) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    private static boolean isUgly(int num) {
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
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }

}
