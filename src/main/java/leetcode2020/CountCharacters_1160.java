package leetcode2020;

import java.util.HashMap;

/**
 * @author coderjoin
 * @date 2020-06-19 19:42
 */
public class CountCharacters_1160 {

    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] array = chars.toCharArray();
        for (char c:array
             ) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        int sum = 0;

        for (int i = 0; i < words.length; i++) {
            char[] tmp = words[i].toCharArray();
            HashMap<Character, Integer> tmpmap = new HashMap<>();
            for (char c:tmp
                 ) {
                tmpmap.put(c,tmpmap.getOrDefault(c,0) + 1);
            }
            boolean isVaild = true;
            for (char a:tmp
                 ) {
                if (map.get(a) != null && map.get(a) >= tmpmap.get(a)) {
                    isVaild = true;
                } else {
                    isVaild = false;
                    break;
                }
            }
            if (isVaild) {
                sum += words[i].length();
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        CountCharacters_1160 c = new CountCharacters_1160();
        System.out.println(c.countCharacters(words,chars));
    }
}
