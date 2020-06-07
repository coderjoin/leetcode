package leetcode2020;

import java.util.Stack;

/**
 *
 * 描述：基本计算器
 *
 *
 * @author coderjoin
 * @date 2020-06-04 10:03
 */
public class Calculate_224 {

    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int operand = 0;
        int result = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                operand = 10 * operand + (ch - '0');
            } else if (ch == '+') {
                result += sign * operand;
                sign = 1;
                operand = 0;
            } else if (ch == '-') {
                result += sign * operand;
                sign = -1;
                operand = 0;
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (ch == ')') {
                result += sign * operand;
                result *= stack.pop();
                result += stack.pop();

                operand = 0;
            }
        }
        return result + (sign * operand);
    }

    private static int cal(char op, int a, int b) {
        if (op == '*') {
            return a * b;
        } else if (op == '/') {
            return a / b;
        } else if (op == '-') {
            return a - b;
        } else {
            return a + b;
        }

    }

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }
}
