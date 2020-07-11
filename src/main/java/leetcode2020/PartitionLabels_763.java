package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-11 10:34
 */
public class PartitionLabels_763 {

    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();

        int[] last = new int[26];
        for (int i = 0; i < S.length(); i++) {
            last[S.charAt(i) - 'a'] = i;
        }

        int j = 0;
        int tmp = 0;
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(j,last[S.charAt(i) - 'a']);
            if (i == j) {
                result.add(i - tmp + 1);
                tmp = i + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        PartitionLabels_763 p = new PartitionLabels_763();
        System.out.println(p.partitionLabels(s));
    }
}
