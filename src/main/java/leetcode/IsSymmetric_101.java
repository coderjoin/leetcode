package leetcode;

/**
 * @author qiaoying
 * @date 2018/12/3 19:29
 */
public class IsSymmetric_101 {


        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            else {
                return isSymmetric(root.left, root.right);
            }
        }
        private boolean isSymmetric(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            else if (left == null || right == null) {
                return false;
            }
            return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }


}
