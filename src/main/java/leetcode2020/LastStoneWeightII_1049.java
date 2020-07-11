package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-22 13:40
 */
public class LastStoneWeightII_1049 {

    public int lastStoneWeightII(int[] stones) {
        int len = stones.length;
        int sum = 0;
        for (int i : stones
             ) {
            sum += i;
        }

        int maxCapacity = sum / 2;
        int[] dp = new int[maxCapacity + 1];
        for (int i = 0; i < len; i++) {
            int curStone = stones[i];
            for (int j = maxCapacity; j >= curStone; j--) {
                dp[j] = Math.max(dp[j], dp[j - curStone] + curStone);
            }
        }
        return sum - 2 * dp[maxCapacity];
    }

    public static void main(String[] args) {

    }
}
