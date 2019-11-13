package aiqiyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-08 15:32
 */
public class Main {

    //List<List<Integer>> result = new ArrayList<>();
    int count = 0;
    public  int permute(int[] nums,int[] fix) {
        helper(nums, 0, fix);

        return count;
    }

    public void helper(int[] nums, int i, int[] fix) {
        if (i == nums.length - 1) {
            List<Integer> list = new ArrayList<>();

            boolean flag = true;
            for (int j = 0; j < fix.length; j++) {
                if (fix[j] == 1 && (nums[j] > nums[j + 1]) ){
                    flag = true;
                } else if (fix[j] == 0 && (nums[j] < nums[j + 1])){
                    flag = true;
                } else {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                //result.add(list);
                count++;
            }

        }

        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            helper(nums, i + 1, fix);
            swap(nums, i, j);
        }
    }

    private void swap(int[] nums,int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = i + 1;
        }
        Main m = new Main();
        int a = m.permute(array,nums);

        System.out.println(a % (1000000000 + 7));

    }
}
