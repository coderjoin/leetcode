package self;

import java.util.LinkedList;

/**
 * @author qiaoying
 * @date 2019-04-30 09:59
 */
public class CountNodes {

    public int countNodes(TreeNode root) {
        int result = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        queue.add(root);
        result++;
        while (queue.size() != 0) {
            TreeNode tmp = queue.poll();
            if (tmp.left != null) {
                queue.add(tmp.left);
                result++;
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;

        CountNodes countNodes = new CountNodes();
        System.out.println(countNodes.countNodes(node1));

    }
}
