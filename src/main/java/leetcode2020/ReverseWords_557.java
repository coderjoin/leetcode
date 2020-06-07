package leetcode2020;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author coderjoin
 * @date 2020-06-03 16:30
 */
public class ReverseWords_557 {

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        String[] array =  sb.reverse().toString().split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length -1; i >= 0; i--) {
            stringBuilder.append(array[i] + " ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
