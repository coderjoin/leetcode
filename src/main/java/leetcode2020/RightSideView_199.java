package leetcode2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author coderjoin
 * @date 2020-07-08 17:36
 */
public class RightSideView_199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            result.add(((LinkedList<TreeNode>) queue).getLast().val);
            int count= queue.size();
            while (count > 0) {
                TreeNode tmp = queue.poll();
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
                count--;
            }


        }

        return result;
    }

    public static void main(String[] args) {

    }

}
