package self;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author qiaoying
 * @date 2019-05-08 15:13
 */
public class IsCousins {

    public boolean isCousins(TreeNode root, int x, int y) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        if (root == null) {
            return false;
        }
        queue.add(root);
        int count = 0;
        map.put(root.val,count);

        while (!queue.isEmpty()) {
            count++;
            int sum = queue.size();
            while (sum > 0) {
                TreeNode node = queue.poll();
                if (node.left != null && node.right != null) {
                    if ( (node.left.val == x && node.right.val == y) ||
                            node.left.val == y && node.right.val == x) {
                        return false;
                    }
                }
                if (node.left != null) {
                    queue.add(node.left);
                    map.put(node.left.val,count);
                }
                if (node.right != null) {
                    queue.add(node.right);
                    map.put(node.right.val,count);
                }
                sum--;
            }


        }

        if (map.get(x) == map.get(y)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        //TreeNode node5 = new TreeNode(5);


        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        //node3.right = node5;

        IsCousins isCousins = new IsCousins();
        System.out.println(isCousins.isCousins(node1,2,3));
    }
}
