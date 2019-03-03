package offer;

import java.util.Arrays;

/**
 * @author qiaoying
 * @date 2019-03-03 17:35
 */
public class IsContinuous {
    public boolean isContinuous(int [] numbers) {
        if (numbers.length <= 4) {
            return false;
        }
        Arrays.sort(numbers);
        int numberZero = 0;
        int numberNeed = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numberZero++;
            } else {
                if (i < (numbers.length - 1)) {
                    if (numbers[i + 1] == numbers[i]) {
                        return false;
                    }
                    numberNeed += (numbers[i + 1] - numbers[i] - 1);
                }
            }


        }
        if (numberZero >= numberNeed) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] numbers = {1,3,2,4,6};
        IsContinuous isContinuous = new IsContinuous();
        
    }
}
