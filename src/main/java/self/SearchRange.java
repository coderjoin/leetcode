package self;

/**
 * @author qiaoying
 * @date 2019-04-21 21:42
 */
public class SearchRange {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                while (mid >= left && nums[mid] == target) {
                    mid--;
                }
                result[0] = mid + 1;
                mid = (left + right) / 2;
                while (mid <= right && nums[mid] == target) {
                    mid++;
                }
                result[1] = mid - 1;
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums,target)[0]);
    }
}
