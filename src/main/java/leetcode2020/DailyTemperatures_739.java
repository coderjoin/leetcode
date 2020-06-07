package leetcode2020;

/**
 *
 * 描述： 每日温度
 * @author coderjoin
 * @date 2020-05-26 16:38
 */
public class DailyTemperatures_739 {

    public static int[] dailyTemperatures(int[] T) {
        int[] result  = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    result[i] = j - i;
                    break;
                } else {
                    result[i] = 0;
                }

            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(nums);
    }
}
