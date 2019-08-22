package bytedance;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-08-11 19:03
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] time = new int[N][2];
        for (int i = 0; i < N; i++) {
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
        }

        int need = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int start = a * 60 + b;

        for (int i = time.length - 1; i > 0; i--) {
            int tmp = time[i][1] + need + time[i][0] * 60;
            System.out.println(tmp);
            if (tmp <= start) {
                System.out.println(time[i][0] + " " +time[i][1]);
                break;
            }
        }
    }


}
