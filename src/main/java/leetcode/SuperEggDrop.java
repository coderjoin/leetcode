package leetcode;

/**
 * @author qiaoying
 * @date 2019-03-13 11:00
 */
public class SuperEggDrop {

    public static int superEggDrop(int K, int N) {
        int[] dp = new int[K + 1];
        for (int i = 0; i <= K ; i++) {
            dp[i] = 1;
        }
        int r = 0;
        while (dp[K] < N + 1) {
            for (int i = K; i > 0;i--) {
                dp[i] += dp[i - 1];
            }
            r++;
        }
        return r;
    }

    public static void main(String[] args) {
        int k = 2;
        int n = 6;
        System.out.println(superEggDrop(k,n));
    }


    public static String replace(String str) {
        if (str == null){
            return null;
        }
        int fromIndex = 0;
        int index = 0;
        StringBuffer temp = new StringBuffer();
        while (index <= str.length()) {
            index = str.indexOf(" ", fromIndex);
            if (index >= 0) {
                temp.append(str.subSequence(fromIndex,index)).append("%20");
                index = index + 1;
                fromIndex = index;
            } else {
                temp.append(str.subSequence(fromIndex,str.length()));
                break;
            }
        }
        return temp.toString();
    }
}
