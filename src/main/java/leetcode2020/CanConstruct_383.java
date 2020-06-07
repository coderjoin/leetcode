package leetcode2020;

import java.util.HashMap;

/**
 *
 *
 * @author coderjoin
 * @date 2020-05-31 09:36
 */
public class CanConstruct_383 {

    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] array_magazine = magazine.toCharArray();
        char[] array_ransomNote = ransomNote.toCharArray();
        for (char c:array_magazine
             ) {
            hashMap.put(c,hashMap.getOrDefault(c,0) + 1);
        }
        HashMap<Character,Integer> hashMap2 = new HashMap<>();
        for (char c:array_ransomNote
             ) {
            hashMap2.put(c,hashMap2.getOrDefault(c,0) + 1);
        }

        for (char c:array_ransomNote
             ) {
            if (hashMap2.get(c) > hashMap.getOrDefault(c,0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNode = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNode, magazine));
    }
}
