package self;

import java.util.*;

/**
 * @author qiaoying
 * @date 2019-05-07 14:45
 */
public class GetPermutation {

    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        List<Integer> candidates = new ArrayList<>();
        // 分母的阶乘数
        int[] factorials = new int[n+1];
        factorials[0] = 1;
        int fact = 1;
        for(int i = 1; i <= n; ++i) {
            candidates.add(i);
            fact *= i;
            factorials[i] = fact;
        }
        k -= 1;
        for(int i = n-1; i >= 0; --i) {
            // 计算候选数字的index
            int index = k / factorials[i];
            sb.append(candidates.remove(index));
            k -= index*factorials[i];
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        int n = 4;
        int k = 5;
        GetPermutation getPermutation = new GetPermutation();
        System.out.println(getPermutation.getPermutation(n, k));
    }
}
