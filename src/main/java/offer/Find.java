package offer;

/**
 * @author qiaoying
 * @date 2019-02-07 10:07
 */
public class Find {

    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || (array.length == 1 && array[0].length == 0)) return false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (target == array[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){

    }
}
