package leetcode;

import java.util.*;

/**
 * @author qiaoying
 * @date 2019-03-16 15:14
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            Integer count = map.get(num);
            if (count == null) {
                count = 1;
            } else {
                count++;
            }
            map.put(num,count);
        }

        List<Integer> list = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        Set<Map.Entry<Integer,Integer>> set = map.entrySet();

        for (Map.Entry<Integer,Integer> entry : set)
            priorityQueue.add(entry);


        for (int i = 0; i < k; i++)
            list.add(priorityQueue.poll().getKey());

        return list;

    }


    public static void main(String[] args) {
        TopKFrequent topKFrequent = new TopKFrequent();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(topKFrequent.topKFrequent(nums,k));
    }
}
