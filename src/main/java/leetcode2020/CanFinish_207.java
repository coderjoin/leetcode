package leetcode2020;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * 课程表
 *    拓扑排序，有向无环图，广度优先遍历或者深度优先遍历
 * @author coderjoin
 * @date 2020-05-27 18:39
 */
public class CanFinish_207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses]; //定义一个入度
        List<List<Integer>> adjacency = new ArrayList<>(); //定义一个邻接表
        Queue<Integer> queue = new LinkedList<>();
        // 初始化邻接表左边
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        // 得到每一门课的入度和邻接表
        for (int[] cp:prerequisites) {
            indegrees[cp[0]]++;
            adjacency.get(cp[1]).add(cp[0]);
        }
        // 找到入度为0的课程
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) {
                queue.add(i);
            }
        }

        // 广度优先遍历
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            numCourses--;
            for (int cur:adjacency.get(tmp)) {
                indegrees[cur]--;
                if (indegrees[cur] == 0) {
                    queue.add(cur);
                }
            }
        }

        return numCourses == 0;

    }
}
