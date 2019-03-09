package offer;

/**
 * @author qiaoying
 * @date 2019-03-09 15:28
 */
public class StrToInt {

    public int StrToInt(String str) {

        if (str == null || str == "" || str.equals("+") || str.equals("-")) {
            return  0;
        }
        int flag = 0;
        long sum = 0;
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[0] == '-' && i == 0) {
                flag = 1;
                continue;
            }
            if (strArray[0] == '+' && i == 0) {
                continue;
            }
            if (!judge(strArray[i])) {
                return 0;
            }
            sum = sum * 10 + strArray[i] - '0';
        }
        if (flag == 1) {
            sum = sum * (-1);
            if (sum < Integer.MIN_VALUE) {
                return 0;
            }

        }
        if (sum > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)sum;

    }

    private boolean judge(char ch) {
        int number = ch - '0';
        if (number >= 0 && number <= 9) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "123";
        StrToInt strToInt = new StrToInt();
        System.out.println(strToInt.StrToInt(a));
    }
}
