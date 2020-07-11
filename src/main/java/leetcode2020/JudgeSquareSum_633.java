package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-25 15:44
 */
public class JudgeSquareSum_633 {


    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int c = 5;
        JudgeSquareSum_633 j = new JudgeSquareSum_633();
        System.out.println(j.judgeSquareSum(c));
    }
}
