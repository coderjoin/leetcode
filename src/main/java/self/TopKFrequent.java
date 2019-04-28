package self;

import java.util.*;

/**
 * @author qiaoying
 * @date 2019-04-28 09:51
 */
public class TopKFrequent {
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String,Integer> map = new LinkedHashMap<>();
        Arrays.sort(words);
        for (String s:words
             ) {
            Integer num = map.get(s);
            if (num == null) {
                map.put(s,1);
            } else {
                int count = map.get(s);
                count++;
                map.put(s,count);
            }
        }

        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }
        return result;
    }


    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 3;
        System.out.println(topKFrequent(words,k));

    }
}
