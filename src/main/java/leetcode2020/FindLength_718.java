package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-10 17:02
 */
public class FindLength_718 {

    public int findLength(int[] A, int[] B) {
        int ans = 0;

        int[][] dp = new int[A.length + 1][B.length + 1];

        for (int i = A.length - 1; i >= 0; i--) {
            for (int j = B.length - 1; j >= 0; j--) {
                if (A[i] == B[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                    if (ans < dp[i][j]) {
                        ans = dp[i][j];
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,2,1};
        int[] B = {3,2,1,4,7};
        FindLength_718 f = new FindLength_718();
        System.out.println(f.findLength(A,B));
    }
}
