package offer;

/**
 * @author qiaoying
 * @date 2019-03-07 21:27
 */
public class InversePairs {
    public int InversePairs(int [] array) {
        if (array == null || array.length <= 1) {
            return 0;
        }
        return mergeSort(array, 0, array.length - 1).pairs;

    }

    class Info {
        int arr[];
        int pairs;
        Info(int[] arr, int pairs) {
            this.arr = arr;
            this.pairs = pairs;
        }
    }

    public Info mergeSort(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0 || start < 0 || end > arr.length - 1 || start > end) {
            throw new IllegalArgumentException();
        }
        if (start == end) {
            return new Info(new int[]{arr[end]},0);
        }
        int pairs = 0;
        int mid = start + ((end - start) >> 1);
        Info left = mergeSort(arr, start, mid);
        Info right = mergeSort(arr, mid + 1, end);
        pairs += (left.pairs + right.pairs) % 1000000007;
        int[] arr1 = left.arr;
        int[] arr2 = right.arr;
        int[] copy = new int[arr1.length + arr2.length];
        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;
        int p = copy.length - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (arr1[p1] > arr2[p2]) {
                pairs += (p2 + 1);
                pairs %= 1000000007;
                copy[p--] = arr1[p1--];
            } else {
                copy[p--] = arr2[p2--];
            }
        }

        while (p1 >= 0) {
            copy[p--] = arr1[p1--];
        }

        while (p2 >= 0) {
            copy[p--] = arr2[p2--];
        }

        return new Info(copy,pairs % 1000000007);

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        InversePairs inversePairs = new InversePairs();
        System.out.println(inversePairs.InversePairs(array));

    }
}
