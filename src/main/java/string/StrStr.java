package string;

/**
 * Created by qiaoying on 2018/7/2.
 */
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int m = haystack.length(), n = needle.length();
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        if (m < n) return -1;
        for (int i = 0; i <= m - n; ++i) {
            int j = 0;
            for (j = 0; j < n; ++j) {
                if (a[i + j] != b[j]) break;
            }
            if (j == n) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        String a = "hello";
        String b = "ll";
        int result = strStr(a,b);
        System.out.println(result);
    }
}
