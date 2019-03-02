package offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author qiaoying
 * @date 2019-03-02 15:22
 */
public class FindGreatestSumOfSubArray {

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length <= 0) {
            return -1;
        }
        int realMax = array[0];
        int currentMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentMax + array[i] >= array[i]) {
                currentMax += array[i];
            } else {
                currentMax = array[i];
            }
            if (currentMax > realMax) {
                realMax = currentMax;
            }
        }
        return realMax;

    }

    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(array));
    }
}
