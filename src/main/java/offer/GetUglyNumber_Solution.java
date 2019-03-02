package offer;

import java.util.ArrayList;

/**
 * @author qiaoying
 * @date 2019-02-28 19:02
 */
public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int index2 = 0, index3 = 0, index5 = 0;
        int count = 1;
        while (count < index) {
            int next = min(list.get(index2) * 2, list.get(index3) * 3, list.get(index5) * 5);
            list.add(next);
            count++;
            while (list.get(index2) * 2 <= next) {
                index2++;
            }
            while (list.get(index3) * 3 <= next) {
                index3++;
            }
            while (list.get(index5) * 5 <= next) {
                index5++;
            }

        }

        return list.get(index - 1);
    }

    public int min(int a, int b, int c) {
        int tmp = (a < b) ? a : b;
        return (tmp < c) ? tmp : c;
    }


    public static void main(String[] args) {
        int index = 1000;
        GetUglyNumber_Solution getUglyNumber_solution = new GetUglyNumber_Solution();
        System.out.println(getUglyNumber_solution.GetUglyNumber_Solution(index));
    }
}
