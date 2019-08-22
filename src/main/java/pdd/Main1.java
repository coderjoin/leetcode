package pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-08-11 15:08
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        double result = cal(array[0],array[1],array[2]);
        for (int i = 0; i < array.length - 2; i++) {
            int a = array[i];
            int b = array[i + 1];
            int c = array[i + 2];
            double tmp = cal(a,b,c);
            if (tmp < result) {
                result = tmp;
            }
        }
        System.out.println(String.format("%.2f",result));
    }

    public static double cal(int a, int b, int c) {
        double avl = (a + b + c)/3.0;
        return ((a - avl) * (a - avl) + (b - avl) * (b - avl) + (c - avl) * (c - avl))/3.0;
    }
}
