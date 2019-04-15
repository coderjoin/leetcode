package self;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @author qiaoying
 * @date 2019-04-15 16:24
 */
public class SetZeroes {

    public static void setZeroes(int[][] matrix) {
        ArrayList<HashMap<Integer,Integer>> list = new ArrayList<>();
        int col = matrix[0].length;
        int row = matrix.length;
        System.out.println(col + " " + row);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    HashMap<Integer,Integer> hashMap = new HashMap<>();
                    hashMap.put(i,j);
                    list.add(hashMap);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Set<Integer> set = list.get(i).keySet();
            for (Integer s : set) {
                for (int k = 0; k < row; k++) {
                    matrix[k][list.get(i).get(s)] = 0;
                }
                for (int k = 0; k < col; k++) {
                    matrix[s][k] = 0;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }
}
