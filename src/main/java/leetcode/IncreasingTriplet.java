package leetcode;

/**
 * @author qiaoying
 * @date 2019-04-11 20:06
 */
public class IncreasingTriplet {

    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        if (nums.length < 3) {
            return false;
        }
        for (int num:nums
             ) {
            if (first > num) {
                first = num;
            }else if (first < num && second > num) {
                second = num;
            }else if (num > second) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        IncreasingTriplet increasingTriplet = new IncreasingTriplet();
        System.out.println(increasingTriplet.increasingTriplet(a));
    }
}
