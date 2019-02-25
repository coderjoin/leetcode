package offer;

import java.util.ArrayList;

/**
 * @author qiaoying
 * @date 2019-02-24 19:43
 */
public class ReOrderArray {
    public static void reOrderArray(int [] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                list2.add(array[i]);
            } else {
                list.add(array[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        for (int i = 0; i < list2.size(); i++) {
            array[list.size() + i] = list2.get(i);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        reOrderArray(a);
    }
}
