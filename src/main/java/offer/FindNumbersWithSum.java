package offer;

import java.util.ArrayList;

/**
 * @author qiaoying
 * @date 2019-03-03 13:39
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length <= 1) {
            return list;
        }
        for (int i = 0, j = array.length - 1; i < j;) {
            if (array[i] + array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);
                break;
            } else if (array[i] + array[j] > sum) {
                j--;
            } else {
                i++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int sum = 10;
        FindNumbersWithSum findNumbersWithSum = new FindNumbersWithSum();

        System.out.println(findNumbersWithSum.FindNumbersWithSum(array, sum));
    }
}
