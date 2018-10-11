package array;

/**
 * @author qiaoying
 * @date 2018/9/28 15:41
 */
public class DominantIndex {
    public static int dominantIndex(int[] nums){

        int max = nums[0];
        int index = 0;
        int result = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        boolean tmp = true;
        for (int i = 0; i < nums.length; i++){
            if (index == i){
                continue;
            }
            if (max >= (2 * nums[i])){
                tmp = true;
            }else {
                tmp = false;
                break;
            }
        }
        if (tmp == true){
            result = index;
        }else {
            result = -1;
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {1};
        System.out.println(dominantIndex(nums));
    }
}
