package leetcode2020;

import java.util.HashMap;

/**
 *
 * 描述 和可被k整除的子数组
 *
 * @author coderjoin
 * @date 2020-05-27 15:13
 */
public class SubarraysDivByK_974 {

    public int subarraysDivByK(int[] A, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int ans = 0;
        for (int e:A) {
            sum += e;  //前缀和
            int modulus = (sum % K + K) % K; //前缀和取余保留正数
            int same = map.getOrDefault(modulus,0);
            ans += same;
            map.put(modulus, same + 1);
        }
        return ans;
    }
}
