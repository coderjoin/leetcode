package self;

/**
 * @author qiaoying
 * @date 2019-04-17 19:16
 */
public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int high = nums.length - 1;
        int low = 0;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid == low) {
                return nums[high] > nums[low] ? high : low;
            }
            if (nums[mid] < nums[mid + 1]) {
                low = mid;
            } else if (nums[mid] > nums[mid + 1]) {
                high = mid;
            }

        }
        return 0;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        System.out.println(findPeakElement(a));
    }
}
