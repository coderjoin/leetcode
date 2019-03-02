package offer;



import java.util.ArrayList;

/**
 * @author qiaoying
 * @date 2019-03-02 14:55
 */
public class FindPath {
    ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        FindPath(root, target, 0, list);
        return resultList;
    }

    public void FindPath(TreeNode root, int target, int sum, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        sum += root.val;
        list.add(root.val);
        if (sum == target && root.left == null && root.right == null) {
            resultList.add(new ArrayList<Integer>(list));
            list.remove(list.size() - 1);
            return;
        }
        FindPath(root.left,target,sum, list);
        FindPath(root.right, target, sum, list);
        list.remove(list.size() - 1);
    }
}
