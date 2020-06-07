package leetcode2020;

import java.util.HashMap;

/**
 *
 * 描述：找不同
 * @author coderjoin
 * @date 2020-05-29 17:29
 */
public class FindTheDifference_389 {

    public static char findTheDifference(String s, String t) {
        char result = ' ';
        HashMap<Character,Integer> hashMap_s = new HashMap<>();
        HashMap<Character,Integer> hashMap_t = new HashMap<>();
        for (char c:s.toCharArray()
             ) {
            Integer tmp = hashMap_s.get(c);
            if (tmp == null) {
                hashMap_s.put(c,1);
            } else {
                hashMap_s.put(c,tmp + 1);
            }
        }

        for (char c:t.toCharArray()
             ) {
            Integer tmp = hashMap_t.get(c);
            if (tmp == null) {
                hashMap_t.put(c,1);
            } else {
                hashMap_t.put(c, tmp + 1);
            }
        }

        for (char c:t.toCharArray()
             ) {
            if (hashMap_s.get(c) == null || hashMap_s.get(c) < hashMap_t.get(c)) {
                result =  c;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
