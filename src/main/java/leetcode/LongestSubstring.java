package leetcode;

/**
 * @author qiaoying
 * @date 2019-03-18 19:31
 */
public class LongestSubstring {
    public int longestSubstring(String s, int k) {
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

    private boolean arrBiggerK(int[] arr, int k) {
        for (int c : arr) {
            if (c > 0 && c < k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aaabb";
        int k = 3;
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.longestSubstring(a,k));
    }
}
