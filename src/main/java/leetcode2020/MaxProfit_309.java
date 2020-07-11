package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-22 10:53
 */
public class MaxProfit_309 {

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp_i0 = 0;
        int dp_i1 = Integer.MIN_VALUE;
        int dp_pre_0 = 0;
        for (int i = 0; i < n; i++) {
            int tmp = dp_i0;
            dp_i0 = Math.max(dp_i0, dp_i1 + prices[i]);
            dp_i1 = Math.max(dp_i1, dp_pre_0 - prices[i]);
            dp_pre_0 = tmp;
        }
        return dp_i0;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,3,0,2};
        MaxProfit_309 m = new MaxProfit_309();
        System.out.println(m.maxProfit(prices));
    }
}
