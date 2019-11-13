package webank;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-19 16:57
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//
//        int result = 0;
//        while (num != 0) {
//            result++;
//            num = num & (num - 1);
//        }
        int out = 1;

        for (int i = 1; i <= num; i++) {
            out *= i;
        }
        System.out.println(out % 1000003);
    }
}
