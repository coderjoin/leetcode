package leetcode_new;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author qiaoying
 * @date 2019/11/12 20:25
 */
public class LRU {

    public static void main(String[] args) {
        int cacheSize = 3;
        LinkedHashMap<String, String> cache = new LinkedHashMap<String, String>(
                (int)(cacheSize/0.75f) + 1, 0.75f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cacheSize;
            }
        };


        cache.put("1", "a");
        cache.put("2", "b");
        cache.put("3", "c");

        // head => "1" => "2" => "3" => null

        // put已存在的值，和get方法是一样的效果
        cache.put("1", "a");

        // head => "2" => "3" => "1" => null;

        cache.put("4", "d");

        // head => "3" => "1" => "4" => null;

        for (String key: cache.keySet()) {
            System.out.println(key);
        }

    }
}
