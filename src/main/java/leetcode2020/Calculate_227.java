package leetcode2020;

import java.util.Stack;

/**
 * @author coderjoin
 * @date 2020-05-31 10:46
 */
public class Calculate_227 {

    public static int calculate(String s) {

        Stack<Integer> stack = new Stack<>();
        char op = '+';
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' '){
                continue;
            }
            if (Character.isDigit(array[i])) {
                int tmpNum = array[i] - '0';
                //多位数的获取
                while (++i < array.length && Character.isDigit(array[i])) {
                    tmpNum = tmpNum * 10 + (array[i] - '0');
                }
                i--;
                if (op == '+') {
                    stack.push(tmpNum);
                } else if (op == '-') {
                    stack.push(-tmpNum);
                } else {
                    stack.push(res(op,stack.pop(), tmpNum));
                }
            } else {
                op = array[i];
            }


        }
        int ans = 0;
        for (int n:stack
             ) {
            ans += n;
        }
        return ans;
    }

    private static int res(char op, int a,int b) {
        if (op == '*') {
            return a * b;
        } else if (op == '/'){
            return a / b;
        } else if (op == '+') {
            return a+b;
        } else {
            return a -b;
        }
    }

    public static void main(String[] args) {
        String s = "3+5 / 2";
        System.out.println(calculate(s));
    }
}
