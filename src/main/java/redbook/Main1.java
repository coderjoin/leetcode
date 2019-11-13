package redbook;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author coderjoin
 * @date 2019-09-03 20:16
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (string.length() <= 1000) {
            char[] array = string.toCharArray();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '<' && !stack.empty() && stack.peek() != ')' && stack.peek() != '(') {
                    stack.pop();
                } else if (array[i] == '<') {

                } else if (array[i] == '(') {
                    stack.push('(');
                } else if (array[i] == ')') {
                    while (!stack.empty()) {
                        if(stack.peek() != '(') {
                            stack.pop();
                        } else {
                            break;
                        }
                    }
                    stack.pop();

                } else {
                    stack.push(array[i]);
                }
            }

            System.out.println(stack.peek());
        }

    }
}
