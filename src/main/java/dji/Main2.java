package dji;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-08-06 20:01
 */
public class Main2 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                int num2= scanner.nextInt();
                HashMap<String, String> map = new HashMap<>();
                int len = 0;
                while ( len < num) {
                    String a = scanner.next();
                    String b = scanner.next();
                    map.put(a,b);
                    len++;
                }
                len = 0;
                while ( len < num2) {
                    String test = scanner.next();
                    String result = map.get(test);
                    sb.append(result);
                    len++;
                }
            }

        System.out.println(sb.toString());
    }
}
