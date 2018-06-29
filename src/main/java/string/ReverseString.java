package string;

/**
 * Created by qiaoying on 2018/5/11.
 */
public class ReverseString {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length/2; i++){
            char tmp = arr[i];
            arr[i] = arr[s.length()-1-i];
            arr[s.length()-i-1] = tmp;
        }
        return new String(arr);
    }

    public static void main(String[] args){
        String s = "hello";
        String s1 = reverseString(s);
        System.out.println(s1);
    }
}
