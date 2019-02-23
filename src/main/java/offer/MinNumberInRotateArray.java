package offer;

/**
 * @author qiaoying
 * @date 2019-02-23 12:50
 */
public class MinNumberInRotateArray {
    public static int minNumberInRotateArray(int [] array) {
        if (array.length <= 0){
            return 0;
        }
        int result = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i + 1] < array[i]){
                result = array[i + 1];
                break;
            }
        }


        return result;
    }

    public static void main(String[] args){
        int[] array = {3,4,5,1,2};
        System.out.println(minNumberInRotateArray(array));
    }
}
