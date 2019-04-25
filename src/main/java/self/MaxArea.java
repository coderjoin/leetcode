package self;

/**
 * @author qiaoying
 * @date 2019-04-25 14:09
 */
public class MaxArea {

    public static int maxArea(int[] height) {
        int result = 0;
        int squre = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int tmp = Math.min(height[i], height[j]);
                squre = tmp * (j - i);
                result = Math.max(squre, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
