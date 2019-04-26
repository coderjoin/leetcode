package self;

import java.util.ArrayList;

/**
 * @author qiaoying
 * @date 2019-04-26 19:36
 */
public class MaxSubArray {

    public static int maxSubArray(int[] nums) {
        int sum=nums[0];
        int n=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(n>0)n+=nums[i];
            else n=nums[i];
            if(sum<n)sum=n;
        }
        return sum;


    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
