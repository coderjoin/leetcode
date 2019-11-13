package webank;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-19 16:30
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
            while (result > 0) {
                if (result % 10 == 0) {
                    result = result / 10;
                } else {
                    result = result % 1000;
                    break;
                }

            }
        }



        while (result > 0) {
            if (result % 10 == 0) {
                result = result / 10;
            } else {
                System.out.println(result % 10);
                break;
            }
        }
    }

}
