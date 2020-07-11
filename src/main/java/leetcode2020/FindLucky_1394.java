package leetcode2020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author coderjoin
 * @date 2020-06-12 20:27
 */
public class FindLucky_1394 {

    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a: arr
             ) {
            map.put(a,map.getOrDefault(a,0) + 1);
        }

        int max = Integer.MIN_VALUE;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == entry.getValue()){
                max = Math.max(max,(int)entry.getValue());
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        FindLucky_1394 f = new FindLucky_1394();
        System.out.println(f.findLucky(arr));
    }
}
