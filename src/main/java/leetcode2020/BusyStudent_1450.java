package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-03 09:58
 */
public class BusyStudent_1450 {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime <= endTime[i] && queryTime >= startTime[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        System.out.println(busyStudent(startTime,endTime,queryTime));
    }
}
