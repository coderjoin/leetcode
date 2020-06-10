package vivo;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2020-06-07 15:02
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
        }
        int result = place(array);
        System.out.println(result);

    }

    public static int place(int[] array) {
        int count = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == 0 && (i == 0 || array[i - 1] == 0)
            && (i == array.length - 1 || array[i + 1] == 0)) {
                array[i] = 1;
                count++;
            }
            i++;
        }
        return count;
    }
}
