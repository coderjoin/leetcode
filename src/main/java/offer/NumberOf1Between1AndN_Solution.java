package offer;

/**
 * @author qiaoying
 * @date 2019-03-02 17:39
 */
public class NumberOf1Between1AndN_Solution {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int result = 0;
        for (long m = 1; m <= n; m *= 10) {
           result += (n/m + 8) / 10 * m + (n/m % 10 == 1 ? n%m + 1 : 0);
        }
        return result;

    }

    public static void main(String[] args) {
        int n = 65535;
        System.out.println(NumberOf1Between1AndN_Solution(n));
    }
}
