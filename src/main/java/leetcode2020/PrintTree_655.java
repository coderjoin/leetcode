package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-07-08 17:14
 */
public class PrintTree_655 {

    List<List<String>> res;
    int height;

    public List<List<String>> printTree(TreeNode root) {
        res = new ArrayList<>();
        this.height = getHeight(root);
        int col = (int)Math.pow(2,height) - 1;
        List<String> row = new ArrayList<>();
        for (int i = 0; i < col; i++) {
            row.add("");
        }
        for (int i = 0; i < height; i++) {
            res.add(new ArrayList<>(row));
        }
        helper(root,0,0,col);
        return res;

    }

    private void helper(TreeNode root, int row, int left, int right) {
        if (root == null || row == height) {
            return;
        }
        res.get(row).set((left + right) / 2, String.valueOf(root.val));
        helper(root.left, row + 1, left, (left + right) / 2 -1);
        helper(root.right,row + 1,(left + right) / 2 + 1, right) ;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static void main(String[] args) {

    }
}
