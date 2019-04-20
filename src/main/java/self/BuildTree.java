package self;

/**
 * @author qiaoying
 * @date 2019-04-20 21:28
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0) {
            return null;
        }
        return build(preorder,0,preorder.length - 1,
                inorder,0,inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int preStart, int perEnd,
                           int[] inorder, int inStart, int inEnd) {
        //前序找根结点
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        //只有根结点
        if (preStart == perEnd) {
            return root;
        }

        //在中序中找根结点
        int rootInorder = inStart;
        while (inorder[rootInorder] != rootVal && rootInorder <= inEnd) {
            rootInorder++;
        }

        //左子树长度
        int leftLength = rootInorder - inStart;


        //前序序列左子树的最后一个结点
        int leftPerEnd = preStart + leftLength;

        //左子树非空
        if (leftLength > 0) {
            root.left = build(preorder,preStart + 1,leftPerEnd,
                    inorder,inStart,inEnd - 1);
        }

        //右子树非空
        if (leftLength < perEnd - preStart) {
            root.right = build(preorder, leftPerEnd + 1,perEnd,
                    inorder,rootInorder + 1, inEnd);
        }

        return root;

    }


    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        BuildTree buildTree = new BuildTree();
        System.out.println(buildTree.buildTree(preorder,inorder).val);
    }
}
