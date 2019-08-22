package pdd;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-08-11 16:04
 */
public class Main3 {

    public  static int solution(int n,int s,int pos) {
        if (n == 1) {
            if (s >= pos) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = 0;
        for (int i = pos; i < s; ++i) {
            count += solution(n - 1, s-i, i + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int result = solution(n,s,1)  % 1000000007;
            System.out.println(result);
        }

    }
}
