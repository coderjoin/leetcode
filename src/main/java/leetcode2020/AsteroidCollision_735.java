package leetcode2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author coderjoin
 * @date 2020-07-03 12:38
 */
public class AsteroidCollision_735 {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty() || stack.peek() * asteroids[i] >= 0 || (stack.peek() < 0 && asteroids[i] > 0)) {
                stack.add(asteroids[i]);
                continue;
            }
            boolean flag = true;
            while (!stack.isEmpty() && (stack.peek() > 0 && asteroids[i] < 0)) {
                if (Math.abs(stack.peek()) > Math.abs(asteroids[i])) {
                    flag = false;
                    break;
                } else if (Math.abs(stack.peek()) == Math.abs(asteroids[i])) {
                    stack.pop();
                    flag = false;
                    break;
                } else  {
                    stack.pop();
                }
            }
            if (flag){
                stack.push(asteroids[i]);
            }
        }
        int[] res = stack.stream().mapToInt(i -> i).toArray();
        return res;
    }

    public static void main(String[] args) {
        int[] asteroids = {5, 10, -5};
        AsteroidCollision_735 a = new AsteroidCollision_735();
        int[] result = a.asteroidCollision(asteroids);
        for (int c:result
             ) {
            System.out.println(c);
        }
    }
}
