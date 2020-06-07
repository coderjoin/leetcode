package leetcode2020;

import java.util.HashMap;

/**
 *
 * 描述： 宝石与石头
 *
 * @author coderjoin
 * @date 2020-05-27 09:29
 */
public class NumJewelsInStones_771 {

    public static int numJewelsInStones(String J, String S) {
        char[] array_j = J.toCharArray();
        char[] array_s = S.toCharArray();
        int sum = 0;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array_s.length; i++) {
            Integer id = hashMap.get(array_s[i]);
            if (id == null) {
                hashMap.put(array_s[i],1);
            } else {
                hashMap.put(array_s[i], id + 1);
            }
        }
        for (int i = 0; i < array_j.length; i++) {
            if (hashMap.containsKey(array_j[i])) {
                sum += hashMap.get(array_j[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }
}
