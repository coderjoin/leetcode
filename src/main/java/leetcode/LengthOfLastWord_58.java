package leetcode;

/**
 * @author qiaoying
 * @date 2018/11/25 23:17
 */
public class LengthOfLastWord_58 {

    public static int lengthOfLastWord(String s){
        int result = 0;
        s = s.trim();
        if (s.equals(" ") || s.length() <= 0){
            return 0;
        }
        String[] words = s.split(" ");
        result = words[words.length - 1].length();
        return result;
    }

    public static void main(String[] args){
        String s = "  ";
        System.out.println(lengthOfLastWord(s));
    }
}
