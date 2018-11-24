package string;

/**
 * @author qiaoying
 * @date 2018/10/30 21:53
 */
public class ReverseVowels {

    public static String reverseVowels(String s) {
        if (s =="" && s == null){
            return s;
        }
        int i = 0;
        int j = s.length()-1;
        char[] arr = s.toCharArray();
        while (i < j){
            while (i < j && !judgeVowel(arr[i])){
                i++;
            }
            while (i < j && !judgeVowel(arr[j])){
                j--;
            }
            if(i < j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static boolean judgeVowel(char c){
        return c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u' |
                c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U';
    }


    public static void main(String[] args){

        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
}
