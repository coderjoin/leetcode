package leetcode2020;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author coderjoin
 * @date 2020-06-30 13:11
 */
public class ShortestPathBinaryMatrix_1091 {

    private static int[][] directions = {{0,1},{0,-1},{1,-1},{1,0},{1,1},{-1,-1},{-1,0},{-1,1}};
    private int row, col;
    public int shortestPathBinaryMatrix(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1) {
            return -1;
        }

        Queue<int[]> queue = new LinkedList<>();

        grid[0][0] = 1;
        queue.add(new int[]{0,0});
        while (!queue.isEmpty() && grid[row - 1][col - 1] == 0) {
            int[] xy = queue.remove();
            int preLength = grid[xy[0]][xy[1]];
            for (int i = 0; i < 8; i++) {
                int x = xy[0] + directions[i][0];
                int y = xy[1] + directions[i][1];
                if (inGrid(x, y) && grid[x][y] == 0) {
                    queue.add(new int[]{x,y});
                    grid[x][y] = preLength + 1;
                }
            }
        }
        return grid[row - 1][col - 1] == 0 ? -1 : grid[row - 1][col - 1];
    }

    private boolean inGrid(int x, int y) {
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        ShortestPathBinaryMatrix_1091 s = new ShortestPathBinaryMatrix_1091();

        System.out.println(s.shortestPathBinaryMatrix(grid));
    }
}
