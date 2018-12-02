package leetcode;

/**
 * @author qiaoying
 * @date 2018/11/26 19:15
 */
public class SearchInsert_35 {

    public static int searchInsert(int[] nums, int target){
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            if (target == nums[i]){
                return i;
            } else if (target > nums[nums.length - 1]){
                return nums.length;
            } else if (target > nums[i] && target < nums[i +1]){
                result = i + 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums,target));
    }
}
