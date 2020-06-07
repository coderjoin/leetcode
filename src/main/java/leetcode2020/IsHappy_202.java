package leetcode2020;

import java.util.HashSet;
import java.util.Set;

/**
 * 描述：快乐数
 * @author coderjoin
 * @date 2020-05-26 10:11
 */
public class IsHappy_202 {



    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }



    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
}
