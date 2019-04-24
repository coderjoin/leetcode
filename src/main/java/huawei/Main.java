package huawei;

/**
 * @author qiaoying
 * @date 2019-04-24 10:49
 */

import java.util.*;
public class Main {

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Main main = new Main();

        int g = main.gcd(a, b);
        int result = a * b / g;
        System.out.println(result);


    }
}