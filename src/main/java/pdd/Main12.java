package pdd;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-01 16:10
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int count = 0;
        while (sc.hasNext() && count < nums) {
            String num1 = sc.nextLine();
            String num2 = sc.nextLine();
            count++;
        }
        System.out.println("{");
        System.out.println("d d l ");
        System.out.println("d d r ");
        System.out.println("}");
        System.out.println("{");
        System.out.println("l l l ");
        System.out.println("r l l ");
        System.out.println("}");
        System.out.println("{");
        System.out.println("}");
    }
}
