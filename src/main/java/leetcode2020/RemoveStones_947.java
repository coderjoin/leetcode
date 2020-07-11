package leetcode2020;

import java.util.Stack;

/**
 * @author coderjoin
 * @date 2020-07-02 09:44
 */
public class RemoveStones_947 {

    public int removeStones(int[][] stones) {
        int len = stones.length;

        int[][] graph = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (stones[i][0] == stones[j][0]
                || stones[i][1] == stones[j][1]) {
                    graph[i][++graph[i][0]] = j;
                    graph[j][++graph[j][0]] = i;
                }
            }
        }

        int ans = 0;
        boolean[] seen = new boolean[len];
        for (int i = 0; i < len; i++) {
            Stack<Integer> stack = new Stack<>();
            stack.push(i);
            seen[i] = true;
            ans--;
            while (!stack.isEmpty()) {
                int node = stack.pop();
                ans++;
                for (int j = 1; j <= graph[node][0]; j++) {
                    int nei = graph[node][j];
                    if (!seen[nei]) {
                        stack.push(nei);
                        seen[nei] = true;
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[][] stones = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        RemoveStones_947 r = new RemoveStones_947();
        System.out.println(r.removeStones(stones));
    }
}
