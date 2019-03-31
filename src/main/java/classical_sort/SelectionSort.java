package classical_sort;

/**
 * @author qiaoying
 * @date 2019-03-31 21:12
 */
public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            int k = i;
            for (int j = k + 1; j < array.length; j++) {
                if (array[j] < array[k]) {
                    k = j;
                }
            }
            if (i != k) {
                int tmp = array[i];
                array[i] = array[k];
                array[k] = tmp;
            }
        }
    }


    public static void main(String[] args) {
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        selectionSort(numbers);
        for (int c:numbers
        ) {
            System.out.println(c);
        }
    }
}
