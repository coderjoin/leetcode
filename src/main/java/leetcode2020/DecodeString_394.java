package leetcode2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author coderjoin
 * @date 2020-05-28 09:51
 */
public class DecodeString_394 {


    public static String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();
        for(Character c : s.toCharArray()) {
            if(c == '[') {
                stack_multi.addLast(multi);
                stack_res.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            }
            else if(c == ']') {
                StringBuilder tmp = new StringBuilder();
                int cur_multi = stack_multi.removeLast();
                for(int i = 0; i < cur_multi; i++) tmp.append(res);
                res = new StringBuilder(stack_res.removeLast() + tmp);
            }
            else if(c >= '0' && c <= '9') multi = multi * 10 + Integer.parseInt(c + "");
            else res.append(c);
        }
        return res.toString();

    }




    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        System.out.println(decodeString(s));
    }
}
