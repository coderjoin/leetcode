package offer;

import java.util.Stack;

/**
 * @author qiaoying
 * @date 2019-02-26 21:53
 */
public class IsPopOrder {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        boolean result = true;
        if (pushA.length != popA.length) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int j = 1;
        stack.push(pushA[0]);
        for (int i = 0; i < popA.length; i++) {
            while (j < pushA.length && stack.peek() != popA[i]) {
                stack.push(pushA[j]);
                j++;
            }
            if (j >= pushA.length && stack.peek() != popA[i]) {
                return false;
            }
            stack.pop();
        }

        return result;
    }


    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,3,5,1,2};
        System.out.println(IsPopOrder(pushA, popA));
    }
}
