package leetcode2020;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author coderjoin
 * @date 2020-05-29 09:57
 */
public class FizzBuzz_412 {

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0){
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(i + "");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }
}
