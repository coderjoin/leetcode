package zhao;

import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-15 21:30
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int index = s.indexOf('L');
        System.out.println(index);
        char[] chars = s.toCharArray();
        int[] array = new int[chars.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        int cycle = 0;
        if ((index + 1) % 2 == 0) {
            cycle = index - 2;
        } else {
            cycle = index - 1;
        }
        for (int i = 0; i < cycle; i++) {
            for (int j = 0; j < chars.length - 1; j++) {
                if (chars[j] == 'R' && chars[j + 1] == 'R') {
                    array[j + 1] = array[j];
                    array[j] = 0;
                } else {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int t:array
             ) {
            System.out.println(t);
        }
    }
}
