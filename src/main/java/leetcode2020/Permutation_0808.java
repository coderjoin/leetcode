package leetcode2020;

import java.util.HashSet;
import java.util.Set;

/**
 * @author coderjoin
 * @date 2020-06-06 14:08
 */
public class Permutation_0808 {

    Set<String> set = new HashSet<>();


    public String[] permutation(String S) {
        char[] array = S.toCharArray();
        backtrack(array,0);

        String[] strings = new String[set.size()];
        int i= 0;
        for (String s:set
             ) {
            strings[i] = s;
            i++;
        }
        return strings;
    }

    private void backtrack(char[] nums, int i) {
        if (i == nums.length - 1) {
            StringBuilder sb = new StringBuilder();
            for (char c:nums
                 ) {
                sb.append(c);
            }
            set.add(sb.toString());
        }
        for (int j = i; j < nums.length; j++) {
            swap(nums,i,j);
            backtrack(nums, i + 1);
            swap(nums, i, j);
        }

    }

    private void swap(char[] nums, int i, int j) {
        char tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        String s = "qqe";
        Permutation_0808 p = new Permutation_0808();
        System.out.println(p.permutation(s));
    }

}
