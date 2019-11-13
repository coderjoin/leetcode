package pdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author coderjoin
 * @date 2019-09-01 15:05
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(";");
        String a = array[0];
        String b = array[1];
        int num = Integer.valueOf(b);
        String[] nums = a.split(",");
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (String s: nums) {
            if (Integer.valueOf(s) % 2 == 1) {
                list1.add(Integer.valueOf(s));
            } else {
                list2.add(Integer.valueOf(s));
            }

        }
        Collections.sort(list1,Collections.reverseOrder());
        Collections.sort(list2,Collections.reverseOrder());
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(list2.get(i));
            if (i != num - 1) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
