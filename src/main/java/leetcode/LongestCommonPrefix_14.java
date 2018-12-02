package leetcode;

/**
 * @author qiaoying
 * @date 2018/11/25 23:31
 */
public class LongestCommonPrefix_14 {

    public static String longestCommonPrefix(String[] strs){
        if (strs.length <= 0){
            return "";
        }
        String str = "";
        char[] s = new char[strs[0].length()];
        boolean tmp = false;
        for (int i = 0; i < strs[0].length(); i++){
           for (int j = 1; j < strs.length; j++){
                   if (i < strs[j].length() && strs[0].charAt(i) == strs[j].charAt(i)){
                       tmp = false;
                   } else {
                       tmp = true;
                       break;
                   }
           }
           if (tmp == false){
               s[i] = strs[0].charAt(i);
            }else{
               break;
           }

        }
        str = String.valueOf(s).trim();
        return str;
    }

    public static void main(String[] args){
        String[] strs = {"aaa","aa","aaa"};
        System.out.println(longestCommonPrefix(strs));
    }
}
