package pdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-01 15:32
 */
public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                list.add(j * i);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list.get(k - 1));
    }

//    public static int kthvalue(int m, int n, int k) {
//        if (k <= 1) {
//            return m * n;
//        } else {
//            if (m - 1 > n) {
//                return kthvalue(m - 1, n , k -1);
//            } else if (m == n) {
//                return kthvalue(m - 1,n, k -2);
//            } else {
//                return kthvalue(m,n - 1,k -1);
//            }
//        }
//
//
//    }
}
