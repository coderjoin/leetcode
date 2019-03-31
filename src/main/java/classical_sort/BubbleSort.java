package classical_sort;

/**
 * @author qiaoying
 * @date 2019-03-31 13:38
 */
public class BubbleSort {

    public void bubbleSort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {6,7,4,5,2,3,1,0,9};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        for (int c:array) {
            System.out.println(c);
        }
    }
}
