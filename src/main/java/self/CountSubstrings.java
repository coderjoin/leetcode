package self;

/**
 * @author coderjoin
 * @date 2019-06-08 21:43
 */
public class CountSubstrings {
    public static int countSubstrings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        boolean[][] dp = new boolean[1001][1001];
        int num = 0;
        //初始化dp
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            num++;
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                num++;
            }
        }

        for (int length = 3; length <= s.length(); length++) {
            for (int i = 0; i <= s.length() - length; i++) {
                dp[i][i + length - 1] = (dp[i + 1][i + length - 2] && (s.charAt(i) == s.charAt(i + length - 1)));
                if (dp[i][i + length - 1]) {
                    num++;
                }
            }
        }
        return num;
    }


    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countSubstrings(s));
    }
}
