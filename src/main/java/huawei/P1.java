package huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author qiaoying
 * @date 2019-05-06 19:03
 */
public class P1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            double d = scanner.nextDouble();
            double min = 10;
            int minn = 0;
            int minm = 0;

            for(int n = 1; n <= 10000; n ++) {
                for (int m = (int) d * n;m <= (d + 1) * n; m++) {
                    double avg = (double)m/(double)n;
                    if (min > Math.abs(avg - d)) {
                        min = Math.abs(avg - d);
                        minn = n;
                        minm = m;
                    }
                }
            }
            System.out.println(minm+" "+minn);
        }


    }


}
