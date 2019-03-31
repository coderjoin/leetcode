package classical_sort;

/**
 * @author qiaoying
 * @date 2019-03-31 14:01
 */
public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while ( j >= 0 && tmp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        insertionSort(numbers);
        for (int c:numbers
        ) {
            System.out.println(c);
        }
    }
}
