package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-30 18:39
 */
public class MaxSatisfied_1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int count = 0 , add = 0 , max = 0 , len = customers.length;
        for (int i = 0; i < len; i++) {
            if (grumpy[i]==0) {
                count += customers[i];
                customers[i] = 0;
            }
        }
        System.out.println(count);
        for (int i = 0; i < X; i++) {
            max += customers[i];
        }
        System.out.println(max);
        add = Math.max(max,add);
        for (int i = X; i < len; i++) {
            max = max+customers[i]-customers[i-X];
            add = Math.max(max,add);
        }
        return count+add;
    }



    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int X = 3;
        MaxSatisfied_1052 m = new MaxSatisfied_1052();
        System.out.println(m.maxSatisfied(customers,grumpy,X));
    }
}
