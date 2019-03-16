package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author qiaoying
 * @date 2019-03-16 14:35
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = nums[i] + "";
        }

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s2.compareTo(s1);
            }
        });


        if (strings[0].charAt(0) == '0') {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber.largestNumber(nums));
    }
}
