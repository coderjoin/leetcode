package leetcode2020;

/**
 *
 * 描述：统计位数为偶数的数字
 * @author coderjoin
 * @date 2020-05-28 21:46
 */
public class FindNumbers_1295 {

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int n:nums
             ) {
           if (countNum(n) % 2 == 0) {
               result++;
           }
        }
        return result;
    }

    private static int countNum(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }


}
