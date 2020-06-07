package leetcode2020;

/**
 *
 * 描述：第k个语法符号
 * @author coderjoin
 * @date 2020-05-27 10:34
 */
public class KthGrammar_779 {

    public static int kthGrammar(int N, int K) {
        if (N == 1) return 0;
        if (K <= (1 << N-2))
            return kthGrammar(N-1, K);
        return kthGrammar(N-1, K - (1 << N-2)) ^ 1;
    }

    public static void main(String[] args) {
        int N = 4, K = 5;
        System.out.println(kthGrammar(N,K));
    }

}
