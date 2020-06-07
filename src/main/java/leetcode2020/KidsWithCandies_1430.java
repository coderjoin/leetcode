package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：拥有糖果最多的孩子
 *
 * @author coderjoin
 * @date 2020-06-01 16:55
 */
public class KidsWithCandies_1430 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();
        for (int c:candies
             ) {
            if (c >= max) {
                max = c;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if ( (candies[i] + extraCandies) >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extra = 3;
        System.out.println(kidsWithCandies(candies,extra));
    }
}
