package redbook;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-03 19:19
 */
public class Main {

    public static int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = 1;
        if (grid[0][0] == 0) {
            return 0;
        }
        for (int i = 1; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                dp[i][0] = 0;
            } else {
                dp[i][0] = dp[i - 1][0] + grid[i][0];
            }

        }
        for (int j = 1; j < grid[0].length; j++) {
            if (grid[0][j] == 0) {
                dp[0][j] = 0;
            } else {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
            }
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
                }

            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = 1;
            }
        }
        int count = 0;
        while (sc.hasNextLine() && count < k) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            array[a][b] = 0;
            count++;
        }
        System.out.println(minPathSum(array));
    }
}
