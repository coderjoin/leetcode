package offer;

/**
 * @author qiaoying
 * @date 2019-03-09 14:57
 */
public class Sum_Solution {
    public int tmp = 0;
    public int Sum_Solution(int n) {
        complex(n);
        return tmp;
    }

    public int complex (int n) {
        boolean flag = (n - 1) >= 0 && (tmp = tmp + n) >0 && complex(n - 1) > 0;
        return tmp;
    }

    public static void main(String[] args) {
        int n = 100;
        Sum_Solution sum_solution = new Sum_Solution();
        System.out.println(sum_solution.Sum_Solution(n));

    }
}
