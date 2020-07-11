package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-13 18:30
 */
public class DetectCapitalUse_520 {

    public boolean detectCapitalUse(String word) {
        char[] array = word.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isUpperCase(array[i])) {
                count++;
            }
        }
        if (count == 0 ) {
            return true;
        } else if ((Character.isUpperCase(array[0]) && count == array.length) ||
                (Character.isUpperCase(array[0]) && count == 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String wprd = "FlaG";
        DetectCapitalUse_520 d = new DetectCapitalUse_520();
        System.out.println(d.detectCapitalUse(wprd));
    }
}
