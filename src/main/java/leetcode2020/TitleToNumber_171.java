package leetcode2020;

/**
 *
 * 描述：Excel表序列号
 *      字母转数字，进制转化
 *
 * @author coderjoin
 * @date 2020-06-01 10:46
 */
public class TitleToNumber_171 {

    public static int titleToNumber(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "AB";
        System.out.println(titleToNumber(s));
    }
}
