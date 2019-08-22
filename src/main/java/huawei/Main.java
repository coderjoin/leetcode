package huawei;

/**
 * @author qiaoying
 * @date 2019-04-24 10:49
 */

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 0;
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine() && len < 6) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            len++;
            len++;

                String str3 = str1 + str1;
                int result = str3.indexOf(str2);
                if (result == -1) {
                    sb.append(0);
                } else {
                    sb.append(1);
                }



        }
        System.out.println(sb.toString());

    }
}