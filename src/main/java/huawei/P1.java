package huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author qiaoying
 * @date 2019-05-06 19:03
 */
public class P1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        char[] chars = nextLine.toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.push(chars[0]);
        int count = 0;
        for (int i = 1; i < chars.length; i++) {

                if (!stack.empty() && chars[i] == stack.peek()) {
                    stack.pop();
                    count++;
                } else {
                    stack.push(chars[i]);
                }


        }
        System.out.println(count);
    }


}
