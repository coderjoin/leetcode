package leetcode2020;

/**
 *
 * 描述：排列硬币
 *
 *
 * @author coderjoin
 * @date 2020-06-01 12:30
 */
public class ArrangeCoins_441 {

    public static int arrangeCoins(int n) {
        return (int)(Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }

    public static void main(String[] args) {
        int n = 5;
        arrangeCoins(n);
    }
}
