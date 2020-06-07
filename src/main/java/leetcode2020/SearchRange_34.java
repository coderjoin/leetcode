package leetcode2020;

/**
 *
 * 描述：在排序数组中查找元素的第一个和最后一个位置
 *
 *
 * @author coderjoin
 * @date 2020-05-29 18:52
 */
public class SearchRange_34 {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int leftIndex = search(nums,target,true);
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            return result;
        }
        result[0] = leftIndex;
        result[1] = search(nums,target,false) - 1;
        return result;
    }

    private static int search(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }


    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(nums,target));
    }
}
