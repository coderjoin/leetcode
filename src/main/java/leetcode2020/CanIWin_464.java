package leetcode2020;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author coderjoin
 * @date 2020-06-08 10:20
 */
public class CanIWin_464 {

    public  boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (maxChoosableInteger >= desiredTotal) {
            return true;
        }
        if ((1 + maxChoosableInteger) * maxChoosableInteger / 2 < desiredTotal) {
            return false;
        }
        int[] state = new int[maxChoosableInteger + 1]; //标记状态

        return backtrace(state, desiredTotal, new HashMap<String, Boolean>());

    }

    private boolean backtrace(int[] state, int total, HashMap<String, Boolean> map) {
        String key = Arrays.toString(state); // 保证状态序列
        if (map.containsKey(key)) {
            return map.get(key);
        } // 防止重复计算

        for (int i = 1; i < state.length; i++) {
            // 没选
            if (state[i] == 0) {
                state[i] = 1;
                // 选了i直接赢了  或者 选了i没赢后面对方还是输了
                if (total - i <= 0 || !backtrace(state,total - i, map)) {
                    map.put(key,true);
                    state[i] = 0; // 回溯一步
                    return true;
                }

                state[i] = 0; // 没赢也要回溯一步
            }
        }
        // 最后也没赢
        map.put(key,false);
        return false;
    }

    public static void main(String[] args) {
        int max = 10;
        int total = 11;
        CanIWin_464 c = new CanIWin_464();
        System.out.println(c.canIWin(max,total));
    }
}
