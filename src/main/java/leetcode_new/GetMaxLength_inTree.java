package leetcode_new;

import java.util.HashMap;

/**
 * @author qiaoying
 * @date 2019/11/11 15:49
 */
public class GetMaxLength_inTree {

    public int preOrder(Node head, int sum, int preSum, int level,
                        int maxLen, HashMap<Integer, Integer> sumMap) {
        if (head == null) {
            return maxLen;
        }
        int curSum = preSum + head.value;
        if (!sumMap.containsKey(curSum)) {
            sumMap.put(curSum, level);
        }
        if (sumMap.containsKey(curSum - sum)) {
            maxLen = Math.max(level - sumMap.get(curSum - sum), maxLen);
        }
        maxLen = preOrder(head.left, sum, curSum, level + 1, maxLen, sumMap);
        maxLen = preOrder(head.right, sum, curSum, level + 1, maxLen, sumMap);
        if (level == sumMap.get(curSum)) {
            sumMap.remove(curSum);
        }
        return maxLen;

    }

    public int getMaxlength(Node head, int sum) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 0);
        return preOrder(head, sum, 0, 1, 0,sumMap);
    }

    public static void main(String[] args) {
        Node node1 = new Node(-3);
        Node node2 = new Node(3);
        Node node3 = new Node(-9);
        Node node4 = new Node(1);
        Node node5 = new Node(0);
        Node node6 = new Node(2);
        Node node7 = new Node(1);
        Node node8 = new Node(1);
        Node node9 = new Node(6);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node5.left = node8;
        node5.right = node9;

        int sum = 6;

        GetMaxLength_inTree g = new GetMaxLength_inTree();
        System.out.println(g.getMaxlength(node1, sum));

    }
}
