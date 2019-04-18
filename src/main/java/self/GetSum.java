package self;

/**
 * @author qiaoying
 * @date 2019-04-18 20:38
 */
public class GetSum {

    public static int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum,carry);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(getSum(a,b));
    }
}
