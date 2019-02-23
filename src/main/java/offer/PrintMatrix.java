package offer;

import java.util.ArrayList;

/**
 * @author qiaoying
 * @date 2019-02-23 18:43
 */
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int cols = matrix[0].length;//列
        int rows = matrix.length;//行
        int left = 0, top = 0, bottom = rows - 1, right = cols - 1;
        int count = 0;
        while (count < cols * rows) {
            for (int i = left; i <= right; i++) {
              list.add(matrix[top][i]);
              count++;
              if (count >= cols * rows) {
                  return list;
              }
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
                count++;
                if (count >= cols * rows) {
                    return list;
                }
            }
            right--;
            for (int i = right; i >= left; i--) {
                list.add(matrix[bottom][i]);
                count++;
                if (count >= cols * rows) {
                    return list;
                }
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                list.add(matrix[i][left]);
                count++;
                if (count >= cols * rows) {
                    return list;
                }
            }
            left++;
        }


        return list;
    }


    public static void main(String[] args){

    }
}
