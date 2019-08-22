package self;

/**
 * @author coderjoin
 * @date 2019-07-18 15:36
 */
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0) {
            return true;
        }
        for (int i = 0, j = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }


}
