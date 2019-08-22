package pdd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-08-11 15:49
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int nums = sc.nextInt();
        int[] array = new int[nums];
        for (int i = 0; i < nums; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        int move = 0;
        int l = 0, h = array.length - 1;
        while (l <= h) {
            move = move + array[h] - array[l];
            l++;
            h--;
        }
        System.out.println(move);
    }
}
