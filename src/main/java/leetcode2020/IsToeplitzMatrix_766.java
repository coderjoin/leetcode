package leetcode2020;

import java.util.HashMap;

/**
 * @author coderjoin
 * @date 2020-06-12 16:49
 */
public class IsToeplitzMatrix_766 {


    public boolean isToeplitzMatrix(int[][] matrix) {
        HashMap<Integer, Integer> group = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (!group.containsKey(i - j)) {
                    group.put(i - j, matrix[i][j]);
                } else if (group.get(i - j) != matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}};
        IsToeplitzMatrix_766 i = new IsToeplitzMatrix_766();
        System.out.println(i.isToeplitzMatrix(matrix));
    }
}
