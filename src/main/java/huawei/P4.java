package huawei;

import java.util.*;

/**
 * @author qiaoying
 * @date 2019-05-06 19:50
 */
public class P4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int need = scanner.nextInt();
        int[] array = new int[total];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
            for (int num : array) {
                Integer count = map.get(num);
                if (count == null) {
                    count = 1;
                } else {
                    count++;
                }
                map.put(num,count);
            }

            int lou = need - map.get(array[array.length - 1]);
            int result = lou * (array[array.length - 1] - array[array.length - map.get(array[array.length - 1]) - 1]);
            //int result = lou * (array[array.length - 1] - array[array.length - 2]);

        System.out.println(result);
    }
}
