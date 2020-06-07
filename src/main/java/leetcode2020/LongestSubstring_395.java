package leetcode2020;

import java.util.HashMap;

/**
 *
 * 描述：至少有k个重复字符的最长子串
 *
 * @author coderjoin
 * @date 2020-05-28 16:40
 */
public class LongestSubstring_395 {

    public static int longestSubstring(String s, int k) {
        if (k <= 1) {
            return s.length();
        }
        char[] arr = s.toCharArray();
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] mip = new int[26];
            mip[arr[i] - 'a']++;
            for (int j = i + 1; j < arr.length; j++) {
                mip[arr[j] - 'a']++;
                if (arrBiggerK(mip, k) == true && j - i + 1 > size) {
                    size = j - i + 1;
                }
            }
        }
        return size;
    }

    private static boolean arrBiggerK(int[] arr, int k) {
        for (int c : arr) {
            if (c > 0 && c < k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aaabbb";
        int k = 3;
        System.out.println(longestSubstring(s,k));
    }
}
