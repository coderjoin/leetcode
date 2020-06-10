package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-08 17:08
 */
public class RemoveBoxes_546 {

    public int removeBoxes(int[] boxes) {
        int[][][] dp = new int[100][100][100];

        return cal(boxes,dp,0,boxes.length - 1,0);
    }

    public int cal(int[] boxes, int[][][] dp, int l, int r, int k) {
        if (l > r) {
            return 0;
        }
        if (dp[l][r][k] != 0) {
            return dp[l][r][k];
        }
        while (r > l && boxes[r] == boxes[r - 1]) {
            r--;
            k++;
        }
        dp[l][r][k] = cal(boxes, dp, l, r - 1, 0) + (k + 1) * (k + 1);

        for (int i = l; i < r; i++) {
            if (boxes[i] == boxes[r]) {
                dp[l][r][k] = Math.max(dp[l][r][k], cal(boxes, dp, l, i, k + 1) +
                        cal(boxes, dp, i + 1, r - 1, 0));
            }
        }

        return dp[l][r][k];
    }

    public static void main(String[] args) {

    }
}
