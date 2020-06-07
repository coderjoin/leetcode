package leetcode2020;

/**
 *
 * 描述：二叉树最小深度
 * @author coderjoin
 * @date 2020-05-29 21:07
 */
public class MinDepth_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if ((root.left == null) && (root.right == null)) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
        }
        if (root.right != null) {
            min = Math.min(minDepth(root.right),min);
        }
        return min + 1;
    }

    public static void main(String[] args) {

    }
}
