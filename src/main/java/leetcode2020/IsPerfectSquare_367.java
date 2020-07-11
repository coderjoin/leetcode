package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-18 10:54
 */
public class IsPerfectSquare_367 {

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        int left = 2;
        int right = num / 2;
        while (left <= right) {
            int mid = (left + right)/2;
            if (mid * mid == num) {
                return true;
            }
            if (mid * mid < num) {
                left = num + 1;
            } else {
                right = num - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        IsPerfectSquare_367 i = new IsPerfectSquare_367();
        System.out.println(i.isPerfectSquare(num));
    }
}
