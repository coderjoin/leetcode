package leetcode;

/**
 * @author qiaoying
 * @date 2018/12/2 20:50
 */
public class ClimbStairs_70 {
    public static int climbStairs(int n){
        if (n == 1 || n == 2) {
            return n;
        }

        int pre = 2, beforePre = 1;
        int curr = 3;
        for (int i = 3; i <= n; ++i) {
            curr = pre + beforePre;
            beforePre = pre;
            pre = curr;
        }
        return curr;

    }

    public static void main(String[] args){
        int n = 3;
        System.out.println(climbStairs(n));
    }
}
