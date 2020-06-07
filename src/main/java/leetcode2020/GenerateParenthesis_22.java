package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 描述： 括号生成
 *       回溯法
 *       左括号不大于n，可以放一个左括号
 *       右括号小于左括号的数量，可以放一个右括号
 * @author coderjoin
 * @date 2020-05-26 15:58
 */
public class GenerateParenthesis_22 {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void helper(List<String> ans,StringBuilder cur,
                       int open,int close,int max) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }

        if (open < max) {
            cur.append('(');
            helper(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }

        if (close < open) {
            cur.append(')');
            helper(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }


}
