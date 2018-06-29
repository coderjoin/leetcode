package string;

/**
 * Created by qiaoying on 2018/5/13.
 */
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] a = new int[26];
        int[] b = new int[26];
        for (int i = 0; i < s.length(); i++){
            a[s.charAt(i) - 97] ++;
            b[t.charAt(i) - 97] ++;
        }
        for (int i = 0; i < 26; i++){
            if (a[i] != b[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println(result);
    }
}
