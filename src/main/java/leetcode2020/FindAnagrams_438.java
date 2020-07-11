package leetcode2020;

import offer.FindGreatestSumOfSubArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-12 13:57
 */
public class FindAnagrams_438 {

    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for (char c:p.toCharArray()
             ) {
            need.put(c,need.getOrDefault(c,0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        List<Integer> result = new ArrayList<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c,window.getOrDefault(c,0) + 1);
                if (window.get(c).intValue() == need.get(c).intValue()) {
                    valid++;
                }
            }

            while (right - left >= p.length()) {
                if (valid == need.size()) {
                    result.add(left);
                }

                char d = s.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (window.get(d).intValue() == need.get(d).intValue()) {
                        valid--;
                    }
                    window.put(d,window.get(d) - 1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        FindAnagrams_438 f = new FindAnagrams_438();
        System.out.println(f.findAnagrams(s,p));
    }
}
