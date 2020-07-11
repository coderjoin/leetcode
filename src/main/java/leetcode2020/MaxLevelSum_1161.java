package leetcode2020;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author coderjoin
 * @date 2020-06-11 18:42
 */
public class MaxLevelSum_1161 {

    public int maxLevelSum(TreeNode root) {
        int currLevel = 1, maxLevel = 1;
        int maxSum = root.val, currSum = 0;

        LinkedList<TreeNode> queue = new LinkedList();
        TreeNode marker = null, x = root;
        queue.addLast(root);
        queue.addLast(marker);

        while (queue.size() > 1) {
            x = queue.removeFirst();
            // continue current level
            if (x != marker) {
                currSum += x.val;
                if (x.left != null) queue.addLast(x.left);
                if (x.right != null) queue.addLast(x.right);
            }
            // end of current level, go to the next level
            else {
                if (currSum > maxSum) {
                    maxSum = currSum;
                    maxLevel = currLevel;
                }
                currSum = 0;
                currLevel++;
                queue.addLast(marker);
            }
        }

        return maxLevel;
    }





}
