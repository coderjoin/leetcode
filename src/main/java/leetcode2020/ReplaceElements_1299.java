package leetcode2020;

/**
 *
 * 描述：将每个元素替换为右侧最大元素
 * @author coderjoin
 * @date 2020-05-28 21:56
 */
public class ReplaceElements_1299 {

    public static int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = max(arr,i + 1, arr.length - 1);
        }
        result[arr.length - 1] = -1;
        return result;

    }

    private static int max(int[] nums, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            if (nums[k] > max) {
                max = nums[k];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(max(arr,2,arr.length - 1));
        int[] result = replaceElements(arr);
        for (int c:result
             ) {
            System.out.println(c);
        }
    }
}
