package leetcode2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-25 16:25
 */
public class SummaryRanges_228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        for (int i = 0, j = 0; j < nums.length; j++) {
            if (j + 1 == nums.length || nums[j] + 1 != nums[j + 1]) {
                res.add(String.valueOf(nums[i]) +
                        (i == j ? "" : "->" + String.valueOf(nums[j])));
                i = j + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        SummaryRanges_228 s = new SummaryRanges_228();
        System.out.println(s.summaryRanges(nums));
    }
}
