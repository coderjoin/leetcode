package neteasy;

import self.Permute;

import java.util.*;

/**
 * @author coderjoin
 * @date 2019-08-03 15:36
 */
public class Main {

    List<List<Integer>> result = new ArrayList<>();
    Set<List<Integer>> test = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        helper(nums, 0);
        test.addAll(result);
        result.clear();
        result.addAll(test);
        return result;
    }

    public void helper(int[] nums, int i) {
        if (i == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                list.add(nums[j]);
            }
            result.add(list);
        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            helper(nums, i + 1);
            swap(nums, i, j);
        }


    }


    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 0;
        ArrayList<String> sb = new ArrayList<>();
        while (sc.hasNextLine() && len < n * 2) {
            int length = sc.nextInt();
            len++;
            int[] nums = new int[length];
            for (int i = 0; i < length; i++) {
                nums[i] = sc.nextInt();
            }
            len++;
            List<List<Integer>> result = main.permuteUnique(nums);
            boolean flag = true;
            for (int i = 0; i < result.size(); i++) {
                for (int j = 1; j < result.get(i).size() - 1; j++) {
                    if (result.get(i).get(j) < (result.get(i).get(j - 1) + result.get(i).get(j + 1))){
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (result.get(i).get(0) < result.get(i).get(1) + result.get(i).get(result.get(i).size() - 1) ) {
                    flag = false;
                }
                if (result.get(i).get(result.get(i).size() - 1) < result.get(i).get(0) + result.get(i).get(result.get(i).size() - 2) ) {
                    flag = false;
                }
            }
            if (flag) {
                sb.add("Yes");
            } else {
                sb.add("No");
            }
        }
        for (int i = 0; i < sb.size(); i++) {
            System.out.println(sb.get(i));
        }

    }
}
