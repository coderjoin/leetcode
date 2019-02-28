package offer;

/**
 * @author qiaoying
 * @date 2019-02-28 20:58
 */
public class HasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (matrix == null || matrix.length != rows * cols || str == null) {
            return false;
        }
        boolean[] visited = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPathCore(matrix, rows, cols, i, j, str, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean hasPathCore(char[] matrix, int rows, int cols, int i, int j,
                                char[] str, int index, boolean[] visited) {
        if (index == str.length) {
            return true;
        }

        if (!match(matrix,rows,cols,i, j, str[index]) || visited[i * cols + j] == true) {
            return false;
        }
        visited[i * cols + j] = true;
        boolean res = hasPathCore(matrix, rows, cols, i+1, j, str, index + 1, visited) ||
                hasPathCore(matrix, rows, cols, i - 1, j, str, index + 1, visited) ||
                hasPathCore(matrix, rows, cols, i, j + 1, str, index + 1, visited) ||
                hasPathCore(matrix, rows, cols, i, j - 1, str, index + 1, visited);
        visited[i * cols + j] = false;
        return res;
    }

    private boolean match(char[] martix, int rows, int cols, int i ,int j, char c) {
        if (i < 0 || i > rows - 1 || j < 0 || j > cols - 1) {
            return false;
        }
        return martix[i * cols + j] == c;
    }

    public static void main(String[] args) {
        HasPath h = new HasPath();
        char[] martix = {'a', 'b' ,'c', 'e' , 's', 'f', 'c', 's', 'a', 'd','e', 'e'};
        char[] path = {'a','b','c','b'};
        System.out.println(h.hasPath(martix,3,4, path));
    }


}
