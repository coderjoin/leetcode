package leetcode2020;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述：岛屿的数量
 *
 *
 *    要点：深度优先搜索，广度优先搜索
 *    本方法用广度优先搜索
 * @author coderjoin
 * @date 2020-05-26 16:11
 */
public class NumIslands_200 {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int row = grid.length;
        int col = grid[0].length;
        int num = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    grid[i][j] = '0'; //搜索过后标记为0
                    Queue<Integer> queue = new LinkedList<>();
                    queue.add(i * col + j);
                    while (!queue.isEmpty()) {
                        int node = queue.remove();
                        int r = node / col;
                        int c = node % col;
                        if (r - 1 >= 0 && grid[r - 1][c] == '1') {
                            queue.add((r - 1) * col + c);
                            grid[r -1][c] = '0';
                        }

                        if (r + 1 < row && grid[r + 1][c] == '1') {
                            queue.add((r + 1) * col + c);
                            grid[r +1][c] = '0';
                        }

                        if (c - 1 >= 0 && grid[r][c - 1] == '1') {
                            queue.add(r * col + c - 1);
                            grid[r][c - 1] = '0';
                        }

                        if (c + 1 < col && grid[r][c + 1] == '1') {
                            queue.add(r * col + c + 1);
                            grid[r][c + 1] = '0';
                        }
                    }
                }
            }
        }
        return num;
    }
}
