package meituan;

import java.util.*;

/**
 * @author coderjoin
 * @date 2019-08-22 15:56
 */
public class Main {

    public static void main(String[] args) {
        //String[] words = {"wrt","wrf","er","ett","rftt"};
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println(order(words));
    }

    public static String order(String[] words) {
        if (words == null || words.length == 0) {
            return "invalid";
        }

        StringBuilder sb = new StringBuilder();
        HashMap<Character, Set<Character>> map = new HashMap<>();
        HashMap<Character, Integer> pre = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        String preword = "";

        for (String current : words) {
            for (Character c : current.toCharArray()) {
                set.add(c);
            }

            for (int i = 0; i < Math.min(preword.length(), current.length()); ++i) {
                if (preword.charAt(i) != current.charAt(i)) {
                    if (!pre.containsKey(current.charAt(i))) {
                        pre.put(current.charAt(i), 1);
                    } else {
                        if (map.containsKey(preword.charAt(i)) &&
                        map.get(preword.charAt(i)).contains(current.charAt(i))) {
                            continue;
                        }
                        pre.put(current.charAt(i), pre.get(current.charAt(i)) + 1);
                    }

                    if (!map.containsKey(preword.charAt(i))) {
                        map.put(preword.charAt(i), new HashSet<>());
                    }

                    map.get(preword.charAt(i)).add(current.charAt(i));
                    break;
                }
            }
            preword = current;
        }

        LinkedList<Character> queue = new LinkedList<>();
        for (Character c : set) {
            if (!pre.containsKey(c)) {
                queue.add(c);
            }
        }

        while (!queue.isEmpty()) {
            Character curr = queue.poll();
            sb.append(curr);

            if (!map.containsKey(curr)) {
                continue;
            }

            for (Character c : map.get(curr)) {
                pre.put(c, pre.get(c) - 1);
                if (pre.get(c) == 0) {
                    queue.offer(c);
                }
            }
        }
        return sb.length() == set.size() ? sb.toString() : "invalid";
    }
}
