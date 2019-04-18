package self;

import java.util.Stack;

/**
 * @author qiaoying
 * @date 2019-04-18 19:29
 */
public class EvalRPN {

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("*")) {
                int tmpA = Integer.parseInt(stack.pop());
                int tmpB = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(tmpB * tmpA));


            }else if (tokens[i].equals("/")) {
                int tmpA = Integer.parseInt(stack.pop());
                int tmpB = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(tmpB / tmpA));

            }else if (tokens[i].equals("+")) {
                int tmpA = Integer.parseInt(stack.pop());
                int tmpB = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(tmpB + tmpA));
            }else if (tokens[i].equals("-")) {
                int tmpA = Integer.parseInt(stack.pop());
                int tmpB = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(tmpB - tmpA));

            } else {
                stack.push(tokens[i]);
            }

        }
        return Integer.parseInt(stack.peek());
    }

    public static void main(String[] args) {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(tokens));
    }
}
