package leetcode2020;

/**
 *
 * 阶乘尾数0的数量
 * @author coderjoin
 * @date 2020-05-26 19:12
 */
public class TrailingZeroes_172 {

    public static int trailingZeroes(int n) {
        int zeroCount = 0;
        long currentMultiple = 5;
        while (n >= currentMultiple) {
            zeroCount += (n / currentMultiple);
            currentMultiple *= 5;
        }
        return zeroCount;

    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(trailingZeroes(n));
    }
}
