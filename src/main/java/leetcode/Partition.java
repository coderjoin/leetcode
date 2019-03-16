package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-03-16 12:54
 */
public class Partition {

    List<List<String>> listResult = new ArrayList<>();

    public List<List<String>> partition(String s) {

        nextWords(s, 0, new ArrayList<>());
        return listResult;
    }

    private void nextWords(String s, int index, List<String> list) {
        if (index == s.length()) {
            listResult.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            String sub = s.substring(index, i + 1);
            if (isPalindrome(sub)) {
                list.add(sub);
                nextWords(s, i + 1, list);
                list.remove(list.size() - 1);
            }
        }

    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i <= s.length() /2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        Partition partition = new Partition();
        System.out.println(partition.partition("leecode"));

    }
}
