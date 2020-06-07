package leetcode2020;

/**
 * 描述： 最大正方形
 *          dp[i][j]是右下角为i，j的最大正方形的边长
 * @author coderjoin
 * @date 2020-05-26 10:45
 */
public class MaximalSquare_221 {

    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return maxSide;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] dp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) { //左右边界
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j - 1]),dp[i - 1][j - 1]) + 1;
                    }
                    maxSide = Math.max(maxSide,dp[i][j]);
                }
            }
        }
        int maxSquare = maxSide * maxSide;
        return maxSquare;
    }


}
