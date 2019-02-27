package offer;

import javafx.scene.SnapshotParametersBuilder;

import java.util.ArrayList;

/**
 * @author qiaoying
 * @date 2019-02-27 22:44
 */
public class MoreThanHalfNum_Solution {
    public static int MoreThanHalfNum_Solution(int [] array) {

        int[] hash = new int[10000000];
        for (int i = 0; i < array.length; i++) {
            hash[array[i]]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > array.length / 2) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,2,2,5,4,2};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
}
