package dji;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-08-06 19:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int len = 0;
        while (scanner.hasNextLine() && len < num) {
            int n = scanner.nextInt();
            int v = scanner.nextInt();
            int[] day = new int[n];
            int[] value = new int[n];
            for (int i = 0; i < n; i++) {
                value[i] = scanner.nextInt();
                day[i] = scanner.nextInt();
            }
            len++;
            int result = bag(v,n,day,value);
            list.add(result);
        }
        for(Integer a : list) {
            System.out.println(a);
        }

    }

    public static int bag(int v,int n,int[] day,int[] value) {
        int[] dp = new int[v + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = v; j >= day[i - 1] ; j--) {
                dp[j] = Math.max(dp[j - day[i - 1]] + value[i - 1],dp[j]);
            }
        }
        return dp[v];
    }
}
