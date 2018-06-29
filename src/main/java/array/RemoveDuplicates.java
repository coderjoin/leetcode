package array;

/**
 * Created by qiaoying on 2018/5/11.
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int ans = 1;
        for(int i = 1 ; i < nums.length; i ++) {
            if(nums[i] == nums[i-1]) continue;
            nums[ans++] = nums[i];
        }
        return ans;

    }

    public static void main(String[] args){
        int[] nums = {1,2,2,3,4,4,5};
        removeDuplicates(nums);
    }
}
