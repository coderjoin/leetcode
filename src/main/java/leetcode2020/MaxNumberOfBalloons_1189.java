package leetcode2020;

import java.util.HashMap;

/**
 * @author coderjoin
 * @date 2020-06-12 20:53
 */
public class MaxNumberOfBalloons_1189 {


    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            hashMap.put(text.charAt(i),hashMap.getOrDefault(text.charAt(i), 0) + 1);
        }

        hashMap.put('l',hashMap.getOrDefault('l',0) / 2);
        hashMap.put('o',hashMap.getOrDefault('o',0) / 2);

        char[] array = {'b','a','l','o','n'};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            Integer tmp = hashMap.get(array[i]);
            if (tmp == null) {
                return 0;
            } else if (tmp < min) {
                min = tmp;
            }
        }

        return min;
    }



    public static void main(String[] args) {
        String text = "nlaebolko";
        MaxNumberOfBalloons_1189 m = new MaxNumberOfBalloons_1189();
        System.out.println(m.maxNumberOfBalloons(text));
    }
}
