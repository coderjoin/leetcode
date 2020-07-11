package leetcode2020;


import javafx.util.Pair;

import java.util.*;

/**
 * @author coderjoin
 * @date 2020-06-15 10:19
 */
public class LadderLength_127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len = beginWord.length();

        HashMap<String, List<String>> map = new HashMap<>();
        wordList.forEach(
                word -> {
                    for (int i = 0; i < len; i++) {
                        String newWord = word.substring(0,i) + '*' + word.substring(i + 1,len);
                        List<String> trans = map.getOrDefault(newWord,new ArrayList<>());
                        trans.add(word);
                        map.put(newWord,trans);
                    }
                }
        );

        LinkedList<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(beginWord, 1));

        Map<String, Boolean> visited = new HashMap<>();
        visited.put(beginWord, true);

        while (!queue.isEmpty()) {
            Pair<String, Integer> node = queue.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < len; i++) {
                String newWord = word.substring(0,i) + '*' + word.substring(i + 1,len);
                for (String adjacentWord : map.getOrDefault(newWord, new ArrayList<>())
                     ) {
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord,true);
                        queue.add(new Pair<>(adjacentWord, level + 1));
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        LadderLength_127 l = new LadderLength_127();
        System.out.println(l.ladderLength(beginWord,endWord,wordList));
    }
}
