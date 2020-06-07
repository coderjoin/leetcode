package leetcode2020;

/**
 *
 * 描述：Excel表列名称
 *
 *      其实是26进制转换
 *
 * @author coderjoin
 * @date 2020-05-30 19:51
 */
public class ConvertToTitle_168 {
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int c = n % 26;
            if (c == 0) {
                c = 26;
                n -= 1;
            }
            sb.insert(0,(char)('A' + c - 1));
            n /= 26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println(convertToTitle(n));
    }
}
