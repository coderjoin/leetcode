package leetcode_new;

/**
 * @author qiaoying
 * @date 2019/11/11 15:16
 *
 *
 *
 * 求无序数组中的和为k的最长子数组的长度
 *
 *
 */
public class GetMaxLength {

    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1};
        int k = 3;
        GetMaxLength g = new GetMaxLength();
        System.out.println(g.getMaxLength(arr, k));
    }

    public int getMaxLength(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int len = 0;
        while (right < arr.length) {
            if (sum == k) {
                len = Math.max(len, right - left + 1);
                sum -= arr[left++];
            } else if (sum < k) {
                right++;
                if (right == arr.length) {
                    break;
                }
                sum += arr[right];
            } else {
                sum -= arr[left++];
            }
        }
        return len;
    }
}
