package classical_sort;

/**
 * @author qiaoying
 * @date 2019-03-31 14:17
 */
public class QuickSort {

    public static void quick(int[] numbers) {
        if (numbers.length > 0) {
            quickSort(numbers,0,numbers.length - 1);
        }
    }

    public static void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int middle = getMiddle(numbers, low, high);
            quickSort(numbers, low, middle - 1);
            quickSort(numbers, middle + 1, high);
        }
    }

    public static int getMiddle(int[] numbers, int low, int high) {
        int tmp = numbers[low];
        while (low < high) {
            while (low < high && numbers[high] > tmp) {
                high--;
            }
            numbers[low] = numbers[high];
            while (low < high && numbers[low] < tmp) {
                low++;
            }
            numbers[high] = numbers[low];
        }
        numbers[low] = tmp;
        return low;
    }

    public static void main(String[] args)
    {
        int[] numbers = {10,20,15,0,6,7,2,1,-5,55};
        quick(numbers);
        for (int c:numbers
             ) {
            System.out.println(c);
        }

    }
}
