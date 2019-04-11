package leetcode;

import java.util.Arrays;
import java.util.Random;

/**
 * @author qiaoying
 * @date 2019-04-11 19:47
 */
public class Solution_384 {
    private int[] originNums;

    private int[] currentNums;

    public Solution_384(int[] nums) {
        originNums = nums;
    }

    public int[] reset() {
        return originNums;
    }

    public int[] shuffle() {
        currentNums = Arrays.copyOf(originNums, originNums.length);
        Random random = new Random();
        for (int i = currentNums.length - 1; i >= 0; i--) {
            int selectNum = random.nextInt(i + 1);
            int tmp = currentNums[selectNum];
            currentNums[selectNum] = currentNums[i];
            currentNums[i] = tmp;
        }
        return currentNums;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        Solution_384 solution_384 = new Solution_384(a);
        int[] c = solution_384.reset();
        int[] b = solution_384.shuffle();
        for (int i:b
             ) {
            System.out.println(i);
        }
    }

}
