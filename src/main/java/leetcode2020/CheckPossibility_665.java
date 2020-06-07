package leetcode2020;

/**
 *
 * 描述：非递减数列
 * @author coderjoin
 * @date 2020-05-26 17:20
 */
public class CheckPossibility_665 {

    public static boolean checkPossibility(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                if(count==1)
                {
                    return false;
                }
                if(i==0)
                {
                    nums[i]=nums[i+1]-1;
                    count++;
                    continue;
                }
                if(pd(nums[i-1],nums[i+1]))
                {
                    count++;
                    nums[i]=nums[i-1];
                }else{
                    count++;
                    nums[i+1]=nums[i];
                }
            }
        }
        return true;
    }
    public static boolean pd(int a,int b)
    {
        if(a>b)
        {
            return false;
        }
        else{
            return true;
        }
    }



    public static void main(String[] args) {
        int[] nums = {
                3,4,2,3
        };
        System.out.println(checkPossibility(nums));
    }
}
