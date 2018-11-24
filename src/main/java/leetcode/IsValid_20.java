package leetcode;

import java.util.Stack;

/**
 * @author qiaoying
 * @date 2018/11/25 00:52
 */
public class IsValid_20 {

    public static boolean isValid(String s){
        boolean value = true;
        Stack<Character> stack = new Stack<Character>();
        char[] arrays = s.toCharArray();
        char temp = 0;
        for (char c : arrays) {


            if(!stack.empty())
            {
                temp = stack.peek();
            }
            switch (c) {

                case ')':
                    if (temp != '(') {
                        value = false;
                    } else {
                        stack.pop();
                    }
                    break;
                case '}':
                    if (temp != '{') {
                        value = false;
                    } else {
                        stack.pop();
                    }
                    break;
                case ']':
                    if (temp != '[') {
                        value = false;
                    } else {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(c);
                    break;

            }
            if (!value) {
                break;
            }

        }

        if(!stack.isEmpty())
        {
            value =false;
        }
        return value;
    }


    public static void main(String[] args){
        String s = "(]";
        System.out.println(isValid(s));
    }
}
