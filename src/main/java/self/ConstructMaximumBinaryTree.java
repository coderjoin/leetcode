package self;

/**
 * @author qiaoying
 * @date 2019-04-28 13:09
 */
public class ConstructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums,0,nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left == right) {
            return new TreeNode(nums[left]);
        }
        int index = left;
        int max = nums[left];
        for (int i = left; i <= right; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(max);
        if (index > left) {
            node.left = helper(nums,left, index - 1);
        }
        if (index < right) {
            node.right = helper(nums,index + 1, right);
        }
        return node;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        ConstructMaximumBinaryTree constructMaximumBinaryTree = new ConstructMaximumBinaryTree();
        System.out.println(constructMaximumBinaryTree.constructMaximumBinaryTree(nums));

    }
}
