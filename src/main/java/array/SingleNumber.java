package array;

/**
 * Created by qiaoying on 2018/5/11.
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++){
            num = num ^ nums[i];
        }
        return num;
    }

    public static void main(String[] args){
        int nums[] = {1,2,4,2,1};
        int num  = 0;
        num= singleNumber(nums);
        System.out.println(num);
    }
}
