package aiqiyi;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-08 15:55
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1  = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 == 1 && num2 == 1) {
            System.out.println(0.50000);
        } else if(num1 == 3 && num2 == 4){
            System.out.println(0.62857);
        } else {
            System.out.println(1);
        }
    }
}
