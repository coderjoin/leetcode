package string;

/**
 * Created by qiaoying on 2018/5/11.
 */
public class Reverse {
    public static int reverse(int x) {
       long result = 0;
       int tmp = Math.abs(x);
       while (tmp > 0){
           result *= 10;
           result += tmp % 10;
           if (result > Integer.MAX_VALUE){
               return 0;
           }
           tmp /= 10;

       }
       return (int)(x >= 0?result : -result);
    }

    public static void main(String[] args){
        int x = 123;
        int a = reverse(x);
        System.out.println(a);
    }
}
