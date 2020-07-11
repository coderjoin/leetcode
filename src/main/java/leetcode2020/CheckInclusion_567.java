package leetcode2020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author coderjoin
 * @date 2020-06-12 10:20
 */
public class CheckInclusion_567 {



    public boolean checkInclusion(String s1, String s2) {

        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> work = new HashMap<>();
        for(char ch:s1.toCharArray()){
            need.put(ch,need.getOrDefault(ch, 0) + 1);
        }
        int left = 0, right = 0;
        int count = 0;
        while(right<s2.length()){
            char right_char = s2.charAt(right);
            right++;
            if(need.containsKey(right_char)){
                work.put(right_char, work.getOrDefault(right_char,0).intValue() + 1);
                if(work.get(right_char).intValue() == need.get(right_char).intValue()){
                    count++;
                }

            }
            while(right - left >= s1.length()){
                if(count == need.size()){
                    return true;
                }
                char left_char = s2.charAt(left);
                left++;
                if(need.containsKey(left_char)){

                    if(work.get(left_char) == need.get(left_char)){
                        count--;
                    }
                    work.put(left_char,work.get(left_char).intValue()-1);

                }

            }

        }
        System.out.println(count);
        return false;
    }


    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "ab";
        CheckInclusion_567 c = new CheckInclusion_567();
        System.out.println(c.checkInclusion(s1,s2));
    }
}
