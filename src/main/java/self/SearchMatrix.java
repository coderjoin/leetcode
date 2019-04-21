package self;

/**
 * @author qiaoying
 * @date 2019-04-21 19:45
 */
public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if ( matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        boolean result = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0 ; j--) {
                if (matrix[i][j] == target) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
            if (result == true) {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {};
        int target = 0;

        System.out.println(searchMatrix(matrix,target));
    }
}
