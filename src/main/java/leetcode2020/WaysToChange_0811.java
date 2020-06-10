package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-08 13:00
 */
public class WaysToChange_0811 {

    public static int waysToChange(int n) {
        int[] coins = new int[]{25,10,5,1};
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= coins.length; i++) {
            for (int j = coins[i - 1]; j <= n; j++) {
                dp[j] += dp[j - coins[i - 1]];
            }
        }
        return (int)(dp[n] % 1000000007);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(waysToChange(n));
    }
}
