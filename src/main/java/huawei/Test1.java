package huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author qiaoying
 * @date 2019-04-24 19:04
 */
public class Test1 {


    public static void main(String[] args){

//        StringBuilder stringbuilder = new StringBuilder();
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            String text = scanner.nextLine().trim();
//            if ("".equals(text)) {
//                break;
//            }
//            stringbuilder.append(text);
//        }
//        System.out.println(stringbuilder);

        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        while (nextLine != null && !nextLine.equals("")) {
            sb.append(nextLine);
            //sb.append(",");
            nextLine = scanner.nextLine();
        }
        //System.out.println(sb);
        String[] strings = sb.toString().split(",");
        for (String a:strings) {
        char[] chars = a.toCharArray();
        boolean result = true;
        if (chars.length % 2 == 1) {
            result = false;
        }
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == chars[chars.length - 1 - i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        for (int i = 0; i < chars.length - 2; i = i + 2) {
            if (chars[i] == chars[i+1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }

        if (result) {
            StringBuffer ab = new StringBuffer();
            for (int i = 0; i < chars.length; i = i + 2) {
                ab.append(chars[i]);
            }
            System.out.println(ab.toString());

        } else {
            System.out.println(result);
        }
        }

    }

}
