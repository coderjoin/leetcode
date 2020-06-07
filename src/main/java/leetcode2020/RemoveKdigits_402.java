package leetcode2020;

import java.util.Stack;

/**
 *
 * 描述：移掉k位数字
 *
 *      栈的应用
 * @author coderjoin
 * @date 2020-05-29 15:24
 */
public class RemoveKdigits_402 {

    public static String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char c:num.toCharArray()
             ) {
            while (stack.size() > 0 && k > 0 && stack.peek() > c) {
                stack.pop();
                k -= 1;
            }
            stack.push(c);
        }


        for (int i = 0; i < k; i++) {
            stack.pop();
        }

        //删除前导0
        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (char c : stack) {
            if (leadingZero && c == '0') continue;
            leadingZero = false;
            sb.append(c);
        }

        if (sb.length() == 0) return "0";
        return sb.toString();
    }

    public static void main(String[] args) {
        String num = "1432219";
        int k = 3;
        System.out.println(removeKdigits(num, k));
    }
}
