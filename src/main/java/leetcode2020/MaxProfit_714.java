package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-22 11:29
 */
public class MaxProfit_714 {

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp_i0 = 0;
        int dp_i1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int tmp = dp_i0;
            dp_i0 = Math.max(dp_i0,dp_i1 + prices[i]);
            dp_i1 = Math.max(dp_i1, tmp - prices[i] - fee);
        }

        return dp_i0;
    }

    public static void main(String[] args) {
        int[] prices = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        MaxProfit_714 m = new MaxProfit_714();
        System.out.println(m.maxProfit(prices,fee));
    }
}
