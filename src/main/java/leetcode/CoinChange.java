package leetcode;

import java.util.Arrays;

/**
 * @author qiaoying
 * @date 2019-03-18 20:22
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0 || amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
//        int[] coins = {1, 2, 5};
//        int amount = 11;
//        CoinChange coinChange = new CoinChange();
//        System.out.println(coinChange.coinChange(coins,amount));


    }
}
