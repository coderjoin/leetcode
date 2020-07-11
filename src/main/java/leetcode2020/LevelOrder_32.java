package leetcode2020;

import java.util.*;

/**
 * @author coderjoin
 * @date 2020-06-29 12:58
 */
public class LevelOrder_32 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        boolean flag = true;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode currNode;

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            if (flag) {
                for (TreeNode t : queue) {
                    list.add(t.val);
                }
                result.add(list);
                flag = false;
            } else {
                for (TreeNode t : queue) {
                    list.add(t.val);
                }
                Collections.reverse(list);
                result.add(list);
                flag = true;
            }
            int count = queue.size();
            while (count > 0) {
                currNode = queue.poll();
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
                count--;
            }




        }

        return result;
    }


}
