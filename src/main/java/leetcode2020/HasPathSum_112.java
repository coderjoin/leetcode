package leetcode2020;

/**
 *
 * 描述：路径总和
 * @author coderjoin
 * @date 2020-05-30 13:39
 */
public class HasPathSum_112 {

    public boolean hasPathSum(TreeNode root, int sum) {


        if (root == null) {
            return false;
        }
        sum -= root.val;
        if ((root.left == null) && (root.right == null)) {

            if (0 == sum) {
                return true;
            } else {
                return false;
            }
        }

        return hasPathSum(root.left, sum) || hasPathSum(root.left, sum);
    }

    public static void main(String[] args) {

    }
}
