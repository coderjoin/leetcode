package leetcode2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author coderjoin
 * @date 2020-06-10 10:41
 */
public class GetHappyString_1415 {

    List<String> result = new ArrayList<>();

    int k = 0;
    int n = 0;

    private static final char[] array = {'a','b','c'};

    public String getHappyString(int n, int k) {
        this.k = k;
        this.n = n;
        backtrack(array,0,new StringBuilder());
        Collections.sort(result);
        if (k > result.size()) {
            return "";
        } else {
            return result.get(k - 1);
        }
    }


    private void backtrack(char[] array,int i,StringBuilder sb) {


        if (sb.length() == n) {
            result.add(sb.toString());
            return;
        }
        for (int j = 0; j < array.length; j++) {
            if (sb.length() == 0 || sb.charAt(sb.length() - 1) != array[j]) {
                sb.append(array[j]);
                backtrack(array, j + 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }



        }
    }

    public static void main(String[] args) {
        int n = 3, k = 9;
        GetHappyString_1415 g = new GetHappyString_1415();
        System.out.println(g.getHappyString(n,k));
    }
}
