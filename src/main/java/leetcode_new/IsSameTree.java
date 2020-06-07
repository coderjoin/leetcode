package leetcode_new;



/**
 * @author qiaoying
 * @date 2019/11/12 20:11
 */
public class IsSameTree {

    public boolean isSameTree(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        if (tree1 != null && tree2 != null) {

            if (tree1.val != tree2.val) {
                return false;
            } else {
                return isSameTree(tree1.left, tree2.left) && isSameTree(tree1.right, tree2.right);
            }
        }
        return false;
    }


}
