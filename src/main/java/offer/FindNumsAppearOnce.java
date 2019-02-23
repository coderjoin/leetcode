package offer;

import java.util.ArrayList;

/**
 * @author qiaoying
 * @date 2019-02-23 21:19
 */
public class FindNumsAppearOnce {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    arr[i]++;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                list.add(array[i]);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }
}
