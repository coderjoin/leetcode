package leetcode2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-29 20:27
 */
public class FourSum_18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len < 4) {
            return result;
        }
        Arrays.sort(nums);

        if (target < nums[0] + nums[1] + nums[2] + nums[3]
        || target > nums[len - 1] + nums[len - 2] + nums[len - 3] + nums[len - 4]) {
            return result;
        }

        for (int i = 0; i < len - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (target < nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3]) {
                break;
            }

            if (target > nums[i] + nums[len - 1] + nums[len - 2] + nums[len - 3]) {
                continue;
            }

            for (int j = i + 1; j < len - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                if (target < nums[i] + nums[j] + nums[j + 1] + nums[j + 2]) {
                    break;
                }
                if (target > nums[i] + nums[j] + nums[len - 1] + nums[len - 2]) {
                    continue;
                }

                int L = j + 1;
                int R = len - 1;

                while (L < R) {
                    int sum = nums[i] + nums[j] + nums[L] + nums[R];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i],nums[j],nums[L],nums[R]));
                        L++;
                        while (L < R && nums[L - 1] == nums[L]) {
                            L++;
                        }
                        R--;
                        while (L < R && nums[R + 1] == nums[R]) {
                            R--;
                        }
                    } else if (sum > target) {
                        R--;
                        while (L < R && nums[R + 1] == nums[R]) {
                            R--;
                        }
                    } else {
                        L++;
                        while (L < R && nums[L - 1] == nums[L]) {
                            L++;
                        }
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        FourSum_18 f= new FourSum_18();
        System.out.println(f.fourSum(nums,target));
    }
}
