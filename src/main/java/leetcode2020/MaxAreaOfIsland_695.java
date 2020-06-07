package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-03 08:48
 */
public class MaxAreaOfIsland_695 {

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, dfs(grid,i,j,m,n));
                }
            }
        }

        return res;
    }

    private int dfs(int[][] grid, int i, int j, int m,int n) {
        if (i < 0 || j < 0 || i >= m || j >=n) {
            return 0;
        }
        if (grid[i][j] == 0) {
            return 0;
        }
        if (grid[i][j] == -1) {
            return 0;
        }
        grid[i][j] = -1;
        int area = 1;
        area += dfs(grid,i - 1,j,m,n);
        area += dfs(grid, i+1, j, m, n);
        area += dfs(grid, i, j - 1, m, n);
        area += dfs(grid, i, j+1, m, n);
        return area;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}


        };
        MaxAreaOfIsland_695 m = new MaxAreaOfIsland_695();
        System.out.println(m.maxAreaOfIsland(grid));
    }


}
