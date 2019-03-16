package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author qiaoying
 * @date 2019-03-16 19:59
 */
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int[] max = new int[nums.length + 1 - k];
        for (int i = 0; i < nums.length; i++) {


            queue.offer(nums[i]);
            if (i >= k) {
                queue.remove(nums[i - k]);
            }
            if (i + 1 >= k) {
                max[i + 1 - k] = queue.peek();
            }



        }
        return max;
    }

    public static void main(String[] args) {
        MaxSlidingWindow maxSlidingWindow = new MaxSlidingWindow();
        int[] nums = {1,-1};
        int k = 1;
        System.out.println(maxSlidingWindow.maxSlidingWindow(nums,k)[1]);
    }
}
