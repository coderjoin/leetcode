package array;

/**
 * @author qiaoying
 * @date 2018/10/30 21:31
 */
public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {


        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    break;
                }

            }
        }
        return result;

    }

    public static void main(String[] args){
        int[] array = {2, 3,4};
        int target = 6;
        int[] result = twoSum(array, target);
        System.out.println(result[0] + "  "+ result[1]);
    }
}
