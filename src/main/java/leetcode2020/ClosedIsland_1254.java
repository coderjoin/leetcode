package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-23 10:31
 */
public class ClosedIsland_1254 {

    public int closedIsland(int[][] grid) {
        int res = 0;
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    if (helper(grid,i,j)) {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    private boolean helper(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length) {
            return false;
        }
        if (grid[x][y] == 1) {
            return true;
        }
        grid[x][y] = 1;
        boolean up = helper(grid, x - 1, y);
        boolean down = helper(grid, x + 1, y);
        boolean left = helper(grid, x, y -  1);
        boolean right = helper(grid, x, y + 1);
        if (up && down && left && right) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};

        ClosedIsland_1254 c = new ClosedIsland_1254();
        System.out.println(c.closedIsland(grid));
    }
}
