package leetcode;

/**
 * @author qiaoying
 * @date 2018/12/3 19:00
 */
public class IsSameTree_100 {

    public static boolean isSameTree(TreeNode p, TreeNode q){

        if (p != null && q != null){
            if (p.val != q.val){
                return false;
            }else {
               return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
            }
        } else {
            if (p == null && q == null){
                return true;
            }else {
                return false;
            }
        }

    }

}
