package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-05-31 19:47
 */
public class FindLengthOfLCIS_674 {

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
                if (count >= max) {
                    max = count;
                }
            } else {

                count = 0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
}
