package offer;

/**
 * @author qiaoying
 * @date 2019-02-26 22:27
 */
public class LeftRotateString {
    public static String LeftRotateString(String str,int n) {
        if (n >= str.length()){
            return "";
        }
        StringBuffer a = new StringBuffer();
        String right = str.substring(n);
        String left = str.substring(0,n);
        a.append(right);
        a.append(left);
        return a.toString();
    }

    public static void main(String[] args) {
        String test = ",6";
        System.out.println(LeftRotateString(test,3));
    }
}
