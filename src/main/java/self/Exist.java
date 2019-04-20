package self;

/**
 * @author qiaoying
 * @date 2019-04-19 15:06
 */
public class Exist {

    public  boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board,visited, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, boolean[][] visited, int row, int col, int index, String word) {
        if (word.length() == index) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
            return false;
        }
        char ch = word.charAt(index);
        if (!visited[row][col] && ch == board[row][col]) {
            visited[row][col] = true;
            boolean rs = dfs(board, visited, row - 1, col, index + 1, word) ||
                    dfs(board, visited, row + 1, col, index + 1, word) ||
                    dfs(board, visited, row , col - 1, index + 1, word) ||
                    dfs(board, visited, row , col + 1, index + 1, word);

            visited[row][col] = false;
            return rs;
        }
        return false;
    }

    public static void main(String[] args) {
        Exist exist = new Exist();

        String s = "ABCCED";
        char[][] chars = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist.exist(chars, s));
    }
}
