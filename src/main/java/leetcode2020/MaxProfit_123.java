package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-22 10:45
 */
public class MaxProfit_123 {

    public int maxProfit(int[] prices) {
        int dp_i10 = 0;
        int dp_i11 = Integer.MIN_VALUE;
        int dp_i20 = 0;
        int dp_i21 = Integer.MIN_VALUE;

        for (int p:prices
             ) {
            dp_i20 = Math.max(dp_i20,dp_i21 + p);
            dp_i21 = Math.max(dp_i21,dp_i10 - p);
            dp_i10 = Math.max(dp_i10,dp_i11 + p);
            dp_i11 = Math.max(dp_i11, -p);
        }

        return dp_i20;
    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        MaxProfit_123 p = new MaxProfit_123();
        System.out.println(p.maxProfit(prices));
    }

}
