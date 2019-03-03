package offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author qiaoying
 * @date 2019-03-03 15:20
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> resultlist = new ArrayList<>();
        if (sum <= 1) {
            return resultlist;
        }
        LinkedList<Integer> queue = new LinkedList<>();
        int n = 1, halfSum = (sum >> 1) + 1, queSum = 0;
        while (n <= halfSum) {
            queue.addLast(n);
            queSum += n;
            if (queSum > sum) {
                while (queSum > sum) {
                    queSum -= queue.pollFirst();
                }
            }
            if (queSum == sum) {
                ArrayList<Integer> one = new ArrayList<>();
                one.addAll(queue);
                resultlist.add(one);
                queSum -= queue.pollFirst();
            }
            n++;
        }
        return resultlist;
    }

    public static void main(String[] args) {
        int sum = 100;
        FindContinuousSequence findContinuousSequence = new FindContinuousSequence();
        System.out.println(findContinuousSequence.FindContinuousSequence(sum));
    }
}
