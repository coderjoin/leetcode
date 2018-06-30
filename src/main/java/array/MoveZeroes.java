package array;

/**
 * Created by qiaoying on 2018/6/29.
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int fast = 0, slow = 0;
        while (fast < length){
            if (nums[fast] != 0){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        for (int i = slow; i < length; i++){
            nums[i] = 0;
        }

    }
    public static void main(String[] args){
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
    }
}
