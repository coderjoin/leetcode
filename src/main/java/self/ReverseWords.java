package self;

/**
 * @author qiaoying
 * @date 2019-04-28 10:42
 */
public class ReverseWords {


    public static String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (!strings[i].equals("")) {
                sb.append(strings[i] + " ");
            }

        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
