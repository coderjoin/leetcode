package offer;

import java.util.LinkedList;

/**
 * @author qiaoying
 * @date 2019-03-09 14:46
 */
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int a = 0;
        while (list.size() > 1) {
            a = (a + m - 1) % list.size();
            list.remove(a);
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        return -1;
    }

    public static void main(String[] args) {
        LastRemaining_Solution lastRemaining_solution = new LastRemaining_Solution();
        int n = 10;
        int m = 5;
        System.out.println(lastRemaining_solution.LastRemaining_Solution(n, m));
    }

}
