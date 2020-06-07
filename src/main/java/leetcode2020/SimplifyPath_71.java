package leetcode2020;

import java.util.Stack;

/**
 *
 * 描述：简化路径
 *
 *
 * @author coderjoin
 * @date 2020-05-31 20:33
 */
public class SimplifyPath_71 {


    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");

        for (String s:str
             ) {
            if (s.equals("..")) {
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else if (!s.equals("") && !s.equals(".")) {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append("/" + stack.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "/home//foo/";
        System.out.println(simplifyPath(s));
    }
}
