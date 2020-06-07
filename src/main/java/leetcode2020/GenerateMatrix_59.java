package leetcode2020;

/**
 *
 * 描述：螺旋矩阵2
 *       螺旋生成矩阵
 * @author coderjoin
 * @date 2020-05-30 11:59
 */
public class GenerateMatrix_59 {

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        while (count <= n * n) {
            for (int i = left; i <= right; i++) {
                result[top][i] = count;
                count++;
                if (count > n * n) {
                    return result;
                }
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = count;
                count++;
                if (count > n * n) {
                    return result;
                }
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = count;
                count++;
                if (count> n * n) {
                    return result;
                }
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = count;
                count++;
                if (count> n * n) {
                    return result;
                }
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] result =  generateMatrix(n);
        for (int[] a:result
             ) {
            for (int b:a
                 ) {
                System.out.println(b);
            }
        }

    }
}
