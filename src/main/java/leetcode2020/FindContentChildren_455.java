package leetcode2020;

import java.util.Arrays;

/**
 * @author coderjoin
 * @date 2020-06-01 20:23
 */
public class FindContentChildren_455 {

    public static int findContentChildren(int[] g, int[] s) {
        int max = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            for (; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    max++;
                    j++;
                    break;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g,s));
    }
}
