package offer;

/**
 * @author qiaoying
 * @date 2019-02-20 21:47
 */
public class NumberOf1 {

    public static int numberOf1(int n){
        int result = 0;
        while (n > 0) {
            result++;
            n = (n - 1) & n;
        }

        return result;
    }

    public static void main(String[] args){

        int n =  9;
        System.out.println(numberOf1(n));
    }
}
