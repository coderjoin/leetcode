import java.util.*;

/**
 * @author coderjoin
 * @date 2019-11-13 16:37
 */
public class Sort1 {

    public static void main(String[] args) {
        int[] a = {1,2,6,4,5};
        Sort1 s = new Sort1();
        //s.sortBubble(a);
        s.selectSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    public void sortBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public void selectSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            int m = i;
            for (int j = i; j < array.length; j++) {
                if (array[m] < array[j]) {
                    m = j;
                }
                if (array[m] != array[j]) {
                    swap(array,m,j);
                }


            }
        }
    }


    public void swap(int[] array, int m, int j) {

        int tmp = array[m];
        array[m] = array[j];
        array[j] = tmp;
    }


    public ArrayList<Integer> test(int[] array1, int[] array2) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            set.add(array2[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer i : set) {
            list.add(i);
        }
        Collections.sort(list);

        return list;
    }
 }
