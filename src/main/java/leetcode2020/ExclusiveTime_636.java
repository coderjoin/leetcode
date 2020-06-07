package leetcode2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author coderjoin
 * @date 2020-06-04 10:45
 */
public class ExclusiveTime_636 {


    public static int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[n];
        String[] s = logs.get(0).split(":");
        stack.push(Integer.parseInt(s[0]));
        int i = 1;
        int pre = Integer.parseInt(s[2]);
        while (i < logs.size()) {
            s = logs.get(i).split(":");
            if (s[1].equals("start")) {
                if (!stack.isEmpty()) {
                    res[stack.peek()] += Integer.parseInt(s[2]) - pre;
                }
                stack.push(Integer.parseInt(s[0]));
                pre = Integer.parseInt(s[2]);
            } else {
                res[stack.peek()] += Integer.parseInt(s[2]) - pre + 1;
                stack.pop();
                pre = Integer.parseInt(s[2]) + 1;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> logs = new ArrayList<>();
        logs.add("0:start:0");
        logs.add("1:start:2");
        logs.add("1:end:5");
        logs.add("0:end:6");
        System.out.println(exclusiveTime(n,logs));
    }
}
