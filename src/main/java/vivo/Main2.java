package vivo;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2020-06-07 15:17
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int N = in.nextInt();

        int[] dp = new int[K + 1];
        for (int i = 0; i <= K; i++) {
            dp[i] = 1;
        }

        int count = 0;
        while (dp[K] < N + 1) {
            for (int i = K; i > 0; i--) {
                dp[i] += dp[i - 1];
            }
            count++;
        }
        System.out.println(count);

    }
}
