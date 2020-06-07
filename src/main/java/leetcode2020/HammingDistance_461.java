package leetcode2020;

/**
 *
 * 描述汉明距离
 *  对于二进制不同位置的数目
 * @author coderjoin
 * @date 2020-05-26 16:52
 */
public class HammingDistance_461 {

    public static int hammingDistance(int x, int y) {

        return Integer.bitCount(x ^ y );
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x,y));
    }
}
