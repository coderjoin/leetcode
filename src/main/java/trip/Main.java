package trip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * @author coderjoin
 * @date 2019-09-04 19:40
 */
public class Main {
    public static void main(String[] args) {
        String str = "(ur)oi";
        System.out.println(resolve(str));
    }


    static String resolve(String expr) {
        StringBuilder sb = new StringBuilder();
        char[] array = expr.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ')') {
                ArrayList<Character> list = new ArrayList<>();
                while (!stack.empty()) {
                    if(stack.peek() != '(') {
                        list.add(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.pop();
                if (stack.empty()) {
                    //Collections.reverse(list);
                    for (Character c: list
                    ) {
                        sb.append(c);
                    }
                } else {
                    for (Character c:list) {
                        stack.push(c);
                    }
                }

            } else {
                stack.push(array[i]);
            }
        }
        if (!stack.empty()) {
            return "";
        }
        return sb.toString();

    }
}
