package leetcode2020;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author coderjoin
 * @date 2020-06-22 13:19
 */
public class LastStoneWeight_1046 {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int a:stones
             ) {
            queue.add(a);
        }
        while (queue.size() > 1){
            int tmp1 = queue.remove();
            int tmp2 = queue.remove();
            if (tmp1 != tmp2) {
                queue.add(Math.abs(tmp1 - tmp2));
            }
        }

        if (queue.size() == 0) {
            return 0;
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        int[] stones = {2,2};
        LastStoneWeight_1046 l = new LastStoneWeight_1046();
        System.out.println(l.lastStoneWeight(stones));
    }
}
