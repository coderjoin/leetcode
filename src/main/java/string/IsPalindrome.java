package string;

/**
 * Created by qiaoying on 2018/7/2.
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end && start < s.length() -1){
            char pre = s.charAt(start);
            char aft = s.charAt(end);
            if (!((pre >= 'a' && pre <= 'z') || (pre >= '0' && pre <= '9'))){
                start++;
                continue;
            }
            if (!((aft >= 'a' && aft <= 'z') || (aft >= '0' && aft <= '9'))){
                end--;
                continue;
            }
            if (pre != aft){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    public static void main(String[] args){
        String string = "A man, a plan, a canal: Panama";
        isPalindrome(string);
    }
}
