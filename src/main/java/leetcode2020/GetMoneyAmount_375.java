package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-08 17:31
 */
public class GetMoneyAmount_375 {

    public int getMoneyAmount(int n) {
        int[][] dp  = new int[n + 1][n + 1];
        for (int len = 2; len <= n; len++) {
            for (int start = 1; start <= n - len + 1 ; start++) {
                int min = Integer.MAX_VALUE;

                for (int piv = start; piv < start + len - 1; piv++) {
                    int res = piv + Math.max(dp[start][piv - 1],dp[piv + 1][start + len -1]);
                    min = Math.min(res,min);
                }
                dp[start][start + len -1] = min;
            }
        }
        return dp[1][n];
    }

    public int cal(int l, int r) {
        if (l >= r) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = (l + r) / 2; i <= r; i++) {
            int res = i + Math.max(cal(l, i - 1),cal(i + 1, r));
            min = Math.min(res,min);
        }

        return min;
    }

    public static void main(String[] args) {
        int n = 10;
        GetMoneyAmount_375 g = new GetMoneyAmount_375();
        System.out.println(g.getMoneyAmount(n));
    }
}
