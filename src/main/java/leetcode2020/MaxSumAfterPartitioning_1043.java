package leetcode2020;

import java.util.Arrays;

/**
 * @author coderjoin
 * @date 2020-07-01 10:32
 */
public class MaxSumAfterPartitioning_1043 {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int len=A.length;
        int[]dp=new int[len+1];
        dp[len-1]=A[len-1];
        int maxVal=0;
        int maxSum=0;
        for(int i=len-2;i>=0;i--){
            maxVal=A[i];
            maxSum=A[i]+dp[i+1];
            for(int j=1;j<K&&i+j<len;j++){
                maxVal=Math.max(maxVal,A[i+j]);
                maxSum=Math.max(maxSum,maxVal*(j+1)+dp[i+j+1]);
            }
            dp[i]=maxSum;

        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] A = {1,15,7,9,2,5,10};
        int K = 3;
        MaxSumAfterPartitioning_1043 m = new MaxSumAfterPartitioning_1043();

        System.out.println(m.maxSumAfterPartitioning(A,K));
    }
}
