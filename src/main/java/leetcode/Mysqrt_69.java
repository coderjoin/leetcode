package leetcode;

/**
 * @author qiaoying
 * @date 2018/12/2 20:43
 */
public class Mysqrt_69 {

    public static int mySqrt(int x){
        int result = 0;
        result = (int)Math.pow(x,0.5);
        return result;
    }

    public static void main(String[] args){
        int x = 10;
        System.out.println(mySqrt(x));
    }
}
