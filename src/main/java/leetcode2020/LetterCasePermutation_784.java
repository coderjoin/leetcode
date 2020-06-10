package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-09 15:32
 */
public class LetterCasePermutation_784 {

    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> tmp = new ArrayList<>();
        tmp.add(new StringBuilder());

        for (char c : S.toCharArray()) {
            int n = tmp.size();

            if (Character.isLetter(c)) {
                for (int i = 0; i < n; i++) {
                    tmp.add(new StringBuilder(tmp.get(i)));
                    tmp.get(i).append(Character.toLowerCase(c));
                    tmp.get(n + i).append(Character.toUpperCase(c));
                }

            } else {
                for (int i = 0; i < n; i++) {
                    tmp.get(i).append(c);
                }
            }
        }

        List<String> result  = new ArrayList<>();
        for (StringBuilder sb:tmp
             ) {
            result.add(sb.toString());
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "a1b2";
        LetterCasePermutation_784 l = new LetterCasePermutation_784();
        System.out.println(l.letterCasePermutation(s));
    }

}
