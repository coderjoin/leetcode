package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by qiaoying on 2018/7/22.
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums != null && nums.length > 2){
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; ){
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k){
                    if (nums[j] + nums[k] == -nums[i]){
                        List<Integer> list = new ArrayList<Integer>(3);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        result.add(list);

                        k--;
                        j++;

                        while (j < k && nums[j] == nums[j - 1]){
                            j++;
                        }
                        while (j < k && nums[k] == nums[k + 1]){
                            k--;
                        }
                    }else if (nums[j] + nums[k] > -nums[i]){
                        k--;
                        while (j < k && nums[k] == nums[k + 1]){
                            k--;
                        }
                    }else {
                        j++;
                        while (j < k && nums[j] == nums[j - 1]){
                            j++;
                        }
                    }
                }
                i++;
                while (i < nums.length - 2 && nums[i] == nums[i -1]){
                    i++;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args){
        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> b = threeSum(a);
        System.out.println(b.size());
    }
}
