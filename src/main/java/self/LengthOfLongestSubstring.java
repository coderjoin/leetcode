package self;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qiaoying
 * @date 2019-04-16 09:46
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int start = 0;
        int end = 0;
        int res = 0;
        Set<Character> set = new HashSet<>();
        while (start < length && end < length) {

            if (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            } else {
                set.add(s.charAt(end));
                end++;
                res = Math.max(res,end - start);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
