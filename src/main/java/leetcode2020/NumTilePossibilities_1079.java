package leetcode2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author coderjoin
 * @date 2020-06-09 16:54
 */
public class NumTilePossibilities_1079 {


    public int numTilePossibilities(String tiles) {
        if (tiles == null || tiles.length() == 0) {
            return 0;
        }
        boolean[] used = new boolean[tiles.length()];
        Set<String> result = new HashSet<>();
        backtrack(tiles.toCharArray(),new StringBuilder(),used,result);
        return result.size();
    }

    private void backtrack(char[] array,StringBuilder sb,boolean[] used,Set<String> result) {
        for (int i = 0; i < array.length; i++) {
            if (used[i]) {
                continue;
            }
            sb.append(array[i]);
            result.add(sb.toString());
            used[i] = true;
            backtrack(array, sb, used, result);
            used[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }

    }


    public static void main(String[] args) {
        String tiles = "AAABBC";
        NumTilePossibilities_1079 n = new NumTilePossibilities_1079();
        System.out.println(n.numTilePossibilities(tiles));
    }
}
