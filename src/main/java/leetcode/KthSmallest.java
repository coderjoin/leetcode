package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author qiaoying
 * @date 2019-03-16 21:54
 */
public class KthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        int result = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                queue.offer(matrix[i][j]);
                if (queue.size() > k) {
                    queue.remove(queue.peek());
                }
            }
        }
        result = queue.peek();
        return result;
    }

    public static void main(String[] args) {
        KthSmallest kthSmallest = new KthSmallest();
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 8;
        System.out.println(kthSmallest.kthSmallest(matrix,k));
    }
}
