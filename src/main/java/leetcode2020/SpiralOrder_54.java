package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 描述：螺旋矩阵
 *      顺时针螺旋遍历
 * @author coderjoin
 * @date 2020-05-30 10:07
 */
public class SpiralOrder_54 {

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length -1 ;
        int m = matrix.length;
        int n = matrix[0].length;
        int size = result.size();
        while ( size < m * n) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
                size++;
                if (size >= m * n) {
                    return result;
                }
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
                size++;
                if (size >= m * n) {
                    return result;
                }
            }
            right--;
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
                size++;
                if (size >= m * n) {
                    return result;
                }
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
                size++;
                if (size >= m * n) {
                    return result;
                }
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}
