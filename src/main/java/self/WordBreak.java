package self;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author qiaoying
 * @date 2019-04-18 19:02
 */
public class WordBreak {
    HashMap<String, List<String>> hashMap = new HashMap<>();

    public  List<String> wordBreak(String s, List<String> wordDict) {
        if (hashMap.containsKey(s)) {
            return hashMap.get(s);
        }
        List<String> list = new ArrayList<>();
        if (s.length() == 0) {
            list.add("");
            return list;
        }
        for (String str : wordDict) {
            if (s.startsWith(str)) {
                List<String> subList = wordBreak(s.substring(str.length()), wordDict);
                for (String sub : subList) {
                    list.add(str + (Objects.equals("",sub) ? "" : " ") + sub);
                }
            }
        }
        hashMap.put(s,list);
        return list;
    }

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        WordBreak w = new WordBreak();

        System.out.println(w.wordBreak(s, wordDict));
    }
}
