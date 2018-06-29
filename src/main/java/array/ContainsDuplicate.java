package array;

/**
 * Created by qiaoying on 2018/5/11.
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean temp = false;
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    temp = true;
                    break;

                }
            }
        }
      return temp;
    }

    public static void main(String[] args){
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        boolean t = containsDuplicate(nums);
        System.out.println(t);
    }
}
