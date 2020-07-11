package leetcode2020;

import java.util.HashMap;

/**
 * @author coderjoin
 * @date 2020-06-22 14:03
 */
public class IsUnique_0101 {

    public boolean isUnique(String astr) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] array = astr.toCharArray();
        for (char c:array
             ) {
            if (map.get(c) == null) {
                map.put(c,1);
            } else {
                return false;
            }
        }

        return true;
    }
}
