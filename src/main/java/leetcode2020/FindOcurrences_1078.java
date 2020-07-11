package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-30 14:30
 */
public class FindOcurrences_1078 {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] array = text.split(" ");
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i].equals(first) && array[i + 1].equals(second)) {
                list.add(array[i + 2]);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "we will we will rock you";
        String first = "we";
        String second = "will";
        FindOcurrences_1078 f = new FindOcurrences_1078();
        String[] result = f.findOcurrences(text,first,second);
        for (String s:result
             ) {
            System.out.println(s);
        }
    }
}
