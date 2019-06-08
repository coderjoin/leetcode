package self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author coderjoin
 * @date 2019-06-08 15:06
 */
public class ReconstructQueue {

    public static int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people,(a,b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
                for (int[] person : people) {
            System.out.println(Arrays.toString(person));
        }
        List<int[]> queue = new ArrayList<>();
        for (int[] p : people
             ) {
          queue.add(p[1],p);
        }
        return queue.toArray(new int[queue.size()][]);
    }

    public static void main(String[] args) {
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        System.out.println(reconstructQueue(people)
        );
    }
}
