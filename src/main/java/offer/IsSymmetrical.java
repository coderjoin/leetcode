package offer;

/**
 * @author qiaoying
 * @date 2019-03-04 22:53
 */
public class IsSymmetrical {

    boolean isSymmetrical(TreeNode pRoot)
    {
        return judge(pRoot, pRoot);
    }
    boolean judge(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.left != null && root2.right != null && root1.left.val != root2.right.val) {
            return false;
        }
        if (root1.right != null && root2.left != null && root1.right.val != root2.left.val) {
            return false;
        }

        return judge(root1.left, root2.right) && judge(root1.right, root2.left);

    }
}
