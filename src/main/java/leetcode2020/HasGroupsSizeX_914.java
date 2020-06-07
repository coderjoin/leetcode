package leetcode2020;

import java.util.*;

/**
 *
 * 描述：卡牌分组
 * @author coderjoin
 * @date 2020-05-27 19:32
 */
public class HasGroupsSizeX_914 {

    public static boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int c: deck)
            count[c]++;

        int g = -1;
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0) {
                if (g == -1)
                    g = count[i];
                else
                    g = gcd(g, count[i]);
            }

        return g >= 2;
    }

    public static int gcd(int x, int y) {
        return x == 0 ? y : gcd(y%x, x);
    }


    public static void main(String[] args) {
        int[] deck = {1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(deck));
    }
}
