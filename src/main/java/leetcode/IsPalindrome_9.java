package leetcode;

/**
 * @author qiaoying
 * @date 2018/11/25 00:06
 */
public class IsPalindrome_9 {

    public static boolean isPalindrome(int x){
        boolean result = true;
        String str = String.valueOf(x);
        int i = 0;
        int j = str.length() -1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                result = false;
                break;
            }
            ++i;
            --j;

        }


        return result;
    }

    public static void main(String[] args){
        int num = -121;
        System.out.println(isPalindrome(num));
    }
}
