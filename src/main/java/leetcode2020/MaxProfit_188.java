package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-22 11:17
 */
public class MaxProfit_188 {

    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if(len == 0){
            return 0;
        }
        if(k>len/2){
            int[][] dp = new int[len][2];
            for(int i=0; i<len; i++){
                if(i == 0){
                    dp[0][0] = 0;
                    dp[0][1] = -prices[i];
                    continue;
                }
                dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
            }
            return dp[len-1][0];
        }
        int[][][] dp = new int[len][k+1][2];
        for(int i=0; i<len; i++){
            for(int j=0; j<=k; j++){
                if(i == 0){
                    dp[0][j][0] = 0;
                    dp[0][j][1] = -prices[i];
                    continue;
                }
                if(j == 0){
                    dp[i][0][0] = 0;
                    dp[i][0][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
            }
        }
        return dp[len-1][k][0];
    }

    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};
        int k = 2;
        MaxProfit_188 m = new MaxProfit_188();
        System.out.println(m.maxProfit(k,prices));
    }
}
