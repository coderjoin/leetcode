package self;

/**
 * @author qiaoying
 * @date 2019-04-16 09:59
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        /**
         * 暴力 n^3
         */
//        if (s.length() == 0) {
//            return "";
//        }
//        if (s.length() == 1) {
//            return s;
//        }
//        int start = 0;
//        int maxlength = 1;
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                int tmp;
//                int tmp2;
//                for (tmp = i,tmp2 = j;tmp < tmp2; tmp++,tmp2--) {
//                    if (s.charAt(tmp) != s.charAt(tmp2)) {
//                        break;
//                    }
//                }
//                if (tmp >= tmp2 && j - i + 1 > maxlength) {
//                    maxlength = j - i + 1;
//                    start = i;
//                }
//            }
//        }
//        return s.substring(start,start + maxlength);


        /**
         * dp
         */

        boolean dp[][] = new boolean[s.length()][s.length()];
        if (s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        int maxlength = 1;
        int start = 0;
        int end = 0;
        int k;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i >= j) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = false;
                }
            }
        }
        int i,j;
        for (k = 1; k < s.length(); k++) {
            for (i = 0; i + k < s.length(); i++) {
                j = i + k;
                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    dp[i][j] = dp[i + 1][j - 1];
                    if (dp[i][j]) {
                        if (k + 1 > maxlength) {
                            maxlength = k + 1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }


    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
