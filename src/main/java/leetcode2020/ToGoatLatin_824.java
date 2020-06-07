package leetcode2020;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 描述: 山羊拉丁文
 *
 * @author coderjoin
 * @date 2020-06-03 19:55
 */
public class ToGoatLatin_824 {


    public  static String toGoatLatin(String S) {
        Set<Character> vowel = new HashSet();
        for (char c: new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'})
            vowel.add(c);

        int t = 1;
        StringBuilder ans = new StringBuilder();
        for (String word: S.split(" ")) {
            char first = word.charAt(0);
            if (vowel.contains(first)) {
                ans.append(word);
            } else {
                ans.append(word.substring(1));
                ans.append(word.substring(0, 1));
            }
            ans.append("ma");
            for (int i = 0; i < t; i++)
                ans.append("a");
            t++;
            ans.append(" ");
        }


        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();

    }



    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin(s));
    }
}
