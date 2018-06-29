package array;

/**
 * Created by qiaoying on 2018/6/28.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int num = 0;
        for (int i = 0; i < digits.length; i++){
            num  += digits[i] * (i+1);
            
        }
        String string = ((Integer)num).toString();
        int[] array = new int[string.length()];
        for (int i = 0; i < string.length(); i++){
            Character ch = string.charAt(i);
            array[i] = Integer.parseInt(ch.toString());
        }
        return array;
    }

    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] result = plusOne(a);
    }
}
