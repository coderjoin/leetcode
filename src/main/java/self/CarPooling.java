package self;

import java.util.Arrays;

/**
 * @author coderjoin
 * @date 2019-07-17 10:50
 */
public class CarPooling {
    public static boolean carPooling(int[][] trips, int capacity) {

        int[] array = new int[1001];
        for (int[] trip : trips) {
            array[trip[1]] += trip[0];
            array[trip[2]] -= trip[0];
        }
        if (array[0] > capacity) {
            return false;
        }
        for (int i = 1; i < 1001; i++) {
            array[i] += array[i - 1];
            if (array[i] > capacity) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[][] trip = {{3,2,7},{3,7,9},{8,3,9}};
        int capacity = 11;
        System.out.println(carPooling(trip, capacity));
    }
}
