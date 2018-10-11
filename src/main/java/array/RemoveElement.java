package array;

/**
 * @author qiaoying
 * @date 2018/10/11 18:42
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[res++] = nums[i];
            }
        }

        return res;
    }

    public static void main(String[] args){
       int[] nums = {3,2,2,3};
       int val = 3;
       int result = removeElement(nums,val);
       System.out.println(result);
    }
}
