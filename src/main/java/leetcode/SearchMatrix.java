package leetcode;

/**
 * @author qiaoying
 * @date 2019-03-13 10:24
 */
public class SearchMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = column - 1; j >=0; j--) {
                if (target == matrix[i][j]) {
                    return true;
                } else if (matrix[i][j] > target) {
                    continue;
                } else {
                    break;
                }

            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[][] a = { {1, 3, 5, 7},
                {10, 11, 16, 20},{23, 30, 34, 50}};
        System.out.println(searchMatrix(a,10));
    }
}
