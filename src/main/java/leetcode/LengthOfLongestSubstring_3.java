package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author qiaoying
 * @date 2019-02-07 09:38
 */
public class LengthOfLongestSubstring_3 {

    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int res = 0;
        int end=0,start=0;
        Set<Character> set=new HashSet<Character>();
        while(start<n && end<n){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }else{
                set.add(s.charAt(end++));
                res=Math.max(res,end-start);
            }

        }
        return res;
    }

    public static void main(String[] args){
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
