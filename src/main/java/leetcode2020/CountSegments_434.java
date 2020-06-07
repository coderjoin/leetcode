package leetcode2020;

/**
 *
 * 描述：字符串中的单词数
 * @author coderjoin
 * @date 2020-05-26 18:34
 */
public class CountSegments_434 {

    public static int countSegments(String s) {
        s = s.trim();
        if (s.equals("")) {
            return 0;
        }
        String[] array = s.split(" ");
        return array.length;
    }

    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
}
