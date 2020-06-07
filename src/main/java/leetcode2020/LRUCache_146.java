package leetcode2020;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author coderjoin
 * @date 2020-05-25 18:29
 */
public class LRUCache_146 extends LinkedHashMap<Integer,Integer> {

    private int capacity;

    public LRUCache_146(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {

        return size() > capacity;
    }

}
