package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-12 20:15
 */
public class Shuffle_1470 {

    public int[] shuffle(int[] nums, int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<n;i++) {
            list.add(nums[i]);
            list.add(nums[i+n]);
        }
        for(int i = 0;i<2*n;i++) {
            nums[i] = list.get(i);
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        Shuffle_1470 s = new Shuffle_1470();
        System.out.println(s.shuffle(nums,n));
    }
}
