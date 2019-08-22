package self;

/**
 * @author coderjoin
 * @date 2019-07-18 19:00
 */
public class StoneGame {

    public static boolean stoneGame(int[] piles) {
        int[][] dp = new int[piles.length][piles.length];
        for (int i = 0; i < piles.length ; i++) {
            for (int j = 0; j < piles.length - i; j++) {
                if (i == 0) {
                    dp[j][j] = piles[i];
                } else {
                    dp[j][j + i] = Math.max(piles[j] - dp[j + 1][j + i],
                            piles[j + i] - dp[j][j + i - 1]);
                }
            }
        }
        if (dp[0][0] < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] piles = {5,3,4,5};
        System.out.println(stoneGame(piles));
    }
}
