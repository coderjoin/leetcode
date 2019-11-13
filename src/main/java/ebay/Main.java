package ebay;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-10-17 19:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int weight = sc.nextInt();
            int[] array = new int[num];
            for (int j = 0; j < num; j++) {
                array[j] = sc.nextInt();
            }
            Arrays.sort(array);
            int s = 0;
            for (int j = num - 1; j >= 0; j--) {
                if (array[j] == 0) {
                    continue;
                }
                int k;
                for (k = j - 1; k >= 0; k--) {
                    if (array[k] != 0) {
                        if (array[j] + array[k] <= weight) {
                            s++;
                            array[k] = 0;
                            break;
                        }
                    }
                }

                if (k < 0) {
                    s++;
                }
            }
            System.out.println(s);

        }

}
