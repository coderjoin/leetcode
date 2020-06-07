package leetcode2020;

/**
 *
 * 描述： 二叉搜索树节点最小距离
 * @author coderjoin
 * @date 2020-05-27 10:58
 */
public class MinDiffInBST_783 {

    Integer min ,pre;
    public  int minDiffInBST(TreeNode root) {
        min = Integer.MAX_VALUE;
        pre = null;
        helper(root);
        return min;
    }

    public  void helper(TreeNode root) {

        if (root == null) return;
        helper(root.left);
        if (pre != null) {
            min = Math.min(min,root.val - pre);
        }
        pre = root.val;
        helper(root.right);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        MinDiffInBST_783 m = new MinDiffInBST_783();
        System.out.println(m.minDiffInBST(root));
    }
}
