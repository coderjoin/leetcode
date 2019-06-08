package huawei;

import java.util.Scanner;

/**
 * @author qiaoying
 * @date 2019-05-06 19:29
 */
public class P2 {

    public static void main(String[] args) {
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[k];

           int sum = 0;
            for (int i = 0; i < k; i++) {
                array[i] = scanner.nextInt();
                sum += array[i];
            }
            result = sum % people;

        System.out.println(result);
    }
}
