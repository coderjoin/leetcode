package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-28 11:15
 */
public class GameOfLife_289 {

    public void gameOfLife(int[][] board) {
       int[] status = {0,1,-1};

       int rows = board.length;
       int cols = board[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int liveNum = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (!(status[i] == 0 && status[j] == 0)) {
                            int r = (row + status[i]);
                            int c = (col + status[j]);

                            if ((r < rows && r >= 0) && (c < cols && c >= 0) &&
                                    (Math.abs(board[r][c]) == 1)) {
                                liveNum += 1;
                            }
                        }
                    }
                }

                if ((board[row][col] == 1) && (liveNum < 2 || liveNum > 3)) {
                    board[row][col] = -1;
                }

                if ((board[row][col] == 0 && liveNum == 3)) {
                    board[row][col] = 2;
                }

            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }


    }


    public static void main(String[] args) {
        int[][] board = {{0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}};

        GameOfLife_289 g = new GameOfLife_289();
        g.gameOfLife(board);
    }
}
