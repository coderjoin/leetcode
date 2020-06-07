package leetcode2020;

import java.util.Stack;

/**
 * @author coderjoin
 * @date 2020-06-05 09:39
 */
public class LargestRectangleArea_84 {

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            //找到左边小于该顶点的值
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            left[i] = (stack.isEmpty() ? -1 : stack.peek());
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            //找到右边小于的顶点
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            right[i] = (stack.isEmpty() ? n : stack.peek());
            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }


    public static void main(String[] args) {

        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
