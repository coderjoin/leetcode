package leetcode2020;




/**
 * @author coderjoin
 * @date 2020-06-10 17:56
 */
public class WiggleMaxLength_376 {



    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int[] up = new int[nums.length];
        int[] down = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    up[i] = Math.max(up[i], down[j] + 1);
                } else if (nums[i] < nums[j]) {
                    down[i] = Math.max(down[i], up[j] + 1);
                }
            }
        }

        return 1+ Math.max(down[nums.length - 1], up[nums.length - 1]);
    }


    public static void main(String[] args) {
        int[] nums = {1,7,4,9,2,5};
        WiggleMaxLength_376 w = new WiggleMaxLength_376();
        System.out.println(w.wiggleMaxLength(nums));
    }

}
