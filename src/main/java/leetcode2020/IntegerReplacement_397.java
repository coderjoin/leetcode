package leetcode2020;

/**
 *
 * 描述：整数替换
 * @author coderjoin
 * @date 2020-05-28 17:14
 */
public class IntegerReplacement_397 {


    public static int integerReplacement(int n) {
        int count = 0;
        long m = n;
        while (m != 1) {
            if (m % 2 == 0) {
                m >>= 1;
            } else if (m == 3) {
                return count + 2;
            } else if((m & 2) == 2) {
                m += 1;
            } else {
                m -= 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(integerReplacement(n));
    }
}
