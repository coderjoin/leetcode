package self;

/**
 * @author coderjoin
 * @date 2019-07-19 15:15
 */
public class Rob {
    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result1 = 0;
        int result2 = 0;
        int a1 = 0;
        int b1 = 0;
        int a2 = 0;
        int b2 = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                a1 = Math.max(a1 + nums[i],b1);
            } else {
                b1 = Math.max(b1 + nums[i], a1);
            }
        }
        result1 = a1 > b1 ? a1 : b1;
        for (int i = 1; i < nums.length; i++) {
            if (i % 2 == 0) {
                a2 = Math.max(a2 + nums[i],b2);
            } else {
                b2 = Math.max(b2 + nums[i], a2);
            }
        }
        result2 = a2 > b2 ? a2 : b2;
        return Math.max(result1, result2);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
