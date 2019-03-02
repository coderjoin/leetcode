package offer;

/**
 * @author qiaoying
 * @date 2019-03-02 18:18
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str.equals("")){
            return -1;
        }
        int[] tmp = new int[256];
        int index = 1;
        char[] array = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (tmp[(int)array[i]] == 0) {
                tmp[(int)array[i]] = index;
                index++;

            } else {
                tmp[(int)array[i]] = -1;
            }
        }
        int minIndex = Integer.MAX_VALUE;
        char ch = '1';
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] > 0) {
                if (tmp[i] < minIndex) {
                    minIndex = tmp[i];
                    ch = (char)i;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
        FirstNotRepeatingChar firstNotRepeatingChar = new FirstNotRepeatingChar();

        System.out.println(firstNotRepeatingChar.FirstNotRepeatingChar(str));
    }
}
