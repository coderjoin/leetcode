package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-05-28 19:31
 */
public class CountNegatives_1351 {

    public static int countNegatives(int[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countNegatives(grid));
    }
}
