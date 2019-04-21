package self;

/**
 * @author qiaoying
 * @date 2019-04-21 20:37
 */
public class SumNumbers {

    public int sumNumbers(TreeNode root) {

        return search(root,0);
    }

    public int search(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return search(root.left, sum) + search(root.right,sum);
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        SumNumbers sumNumbers = new SumNumbers();
        System.out.println(sumNumbers.sumNumbers(treeNode1));
    }
}
