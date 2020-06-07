package leetcode2020;

/**
 *
 * 描述：将数字变成0的操作次数
 *
 *
 * @author coderjoin
 * @date 2020-05-29 09:25
 */
public class NumberOfSteps_1342 {

    public static int numberOfSteps (int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num -= 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));
    }
}
