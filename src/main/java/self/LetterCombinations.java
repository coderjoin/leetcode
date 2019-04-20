package self;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-04-20 22:09
 */
public class LetterCombinations {
    StringBuffer sb = new StringBuffer();
    String[] strings = new String[] {
            "","","abc","def","ghi","jkl","mno",
            "pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }

        comb(digits, 0 , result);
        return result;
    }

    private void comb(String digits, int n, List<String> result) {
        if (n == digits.length()) {
            result.add(sb.toString());
            return;
        }

        for (int i = 0; i < strings[digits.charAt(n) - '0'].length(); i++) {
            sb.append(strings[digits.charAt(n) - '0'].charAt(i));
            comb(digits, n + 1, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


    public static void main(String[] args) {
        LetterCombinations letterCombinations = new LetterCombinations();
        List<String> list = letterCombinations.letterCombinations("");
        System.out.println(list);
    }
}
