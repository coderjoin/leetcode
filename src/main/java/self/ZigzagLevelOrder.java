package self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-04-19 09:49
 */
public class ZigzagLevelOrder {


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        System.out.println(zigzagLevelOrder(treeNode1));
    }
}
