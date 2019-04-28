package self;

/**
 * @author qiaoying
 * @date 2019-04-27 20:33
 */
public class Multiply {


    public static String multiply(String num1, String num2) {
        String s1 = new StringBuilder(num1).reverse().toString();
        String s2 = new StringBuilder(num2).reverse().toString();

        int[] array = new int[s1.length() + s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                array[i + j] += (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int digit = array[i] % 10;
            int carry = array[i] / 10;
            if (i + 1 < array.length) {
                array[i + 1] += carry;
            }
            stringBuilder.insert(0,digit);
        }

        while (stringBuilder.charAt(0) == '0' && stringBuilder.length() > 1) {
            stringBuilder.deleteCharAt(0);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println(multiply(num1,num2));
    }
}
