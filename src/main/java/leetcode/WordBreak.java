package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-03-15 20:22
 */
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i - 1; j >= 0 && !dp[i]; j--) {
                String check = s.substring(j, i);
                dp[i] = dp[j] && wordDict.contains(check);
            }
        }
        return dp[s.length()];


    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(wordBreak(s,list));
    }
}
