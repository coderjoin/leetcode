package leetcode2020;

/**
 *
 * 描述：各位相加
 * @author coderjoin
 * @date 2020-05-31 09:11
 */
public class AddDigits_258 {

    public static int addDigits(int num) {
        int result = 0;
        int sum = 0;
        while (num > 0) {
            int tmp = num % 10;
            sum += tmp;
            num /= 10;
        }
        if (sum < 10) {
            result = sum;
        } else {
            result = addDigits(sum);
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
}
