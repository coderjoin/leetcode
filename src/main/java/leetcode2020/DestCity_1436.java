package leetcode2020;

import java.util.*;

/**
 * @author coderjoin
 * @date 2020-06-03 16:01
 */
public class DestCity_1436 {


    public static String destCity(List<List<String>> paths) {
        Map<String, String> map = prepare(paths);
        String from = paths.get(0).get(0);
        while(true){
            if(!map.containsKey(from))
                return from;
            from = map.get(from);
        }
    }

    private static Map<String, String> prepare(List<List<String>> paths){
        Map<String, String> map = new HashMap<>();
        for(List<String> path : paths)
            map.put(path.get(0), path.get(1));
        return map;
    }



    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(new ArrayList<String>() {
            {add("b");
            add("c");}
        });
        paths.add(new ArrayList<String>() {
            {add("d");
                add("b");}
        });
        paths.add(new ArrayList<String>() {
            {add("c");
                add("a");}
        });

        System.out.println(destCity(paths));
    }
}
