package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author qiaoying
 * @date 2019-04-11 20:24
 */
public class MedianFinder {

    public int count = 0;

    public PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int num) {
        if (count % 2 == 0) {
            maxHeap.offer(num);
            int tmp = maxHeap.poll();
            minHeap.offer(tmp);
        } else {
            minHeap.offer(num);
            int tmp = minHeap.poll();
            maxHeap.offer(tmp);
        }
        count++;
    }

    public double findMedian() {
        if (count % 2 == 0) {
            return (minHeap.peek() + maxHeap.peek())/2.0;
        }else {
            return minHeap.peek();
        }
    }


    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        medianFinder.addNum(3);

        System.out.println(medianFinder.findMedian());
    }
}
