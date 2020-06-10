package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-09 14:29
 */
public class GetMaximumGold_1219 {

    public int getMaximumGold(int[][] grid) {
        int result  = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    result = Math.max(result, dfs(grid, i, j, 0));
                }
            }
        }
        return result;
    }

    private int dfs(int[][] grid, int x, int y, int count) {
        if (!isValid(grid.length, grid[0].length, x, y)) {
            return count;
        }
        if (grid[x][y] == 0) {
            return count;
        }
        count += grid[x][y];
        int tmp = grid[x][y];
        grid[x][y] = 0;
        int up = dfs(grid, x, y - 1, count);
        int left = dfs(grid, x - 1, y, count);
        int right = dfs(grid, x + 1, y, count);
        int bottom = dfs(grid, x, y + 1, count);
        grid[x][y] = tmp;
        return Math.max(up, Math.max(left, Math.max(right,bottom)));
    }

    private boolean isValid(int len, int wide, int x, int y) {
        return x >= 0 && x < len && y >= 0 && y < wide;
    }


    public static void main(String[] args) {
        int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
        GetMaximumGold_1219 g = new GetMaximumGold_1219();
        System.out.println(g.getMaximumGold(grid));
    }
}
