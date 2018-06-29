package array;

/**
 * Created by qiaoying on 2018/5/11.
 */
public class Rotate {
    public static void rotate(int[] nums, int k) {

        while (k > 0){
            for (int j = nums.length -1; j > 0 ; j--){
                int temp = 0;
                temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
            k--;
        }



        for (int q = 0; q < nums.length; q++){
            System.out.println(nums[q]);
        }
    }

    public static void main(String[] args){
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotate(nums,k);
    }
}
