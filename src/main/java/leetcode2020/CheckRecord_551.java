package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-01 20:40
 */
public class CheckRecord_551 {
    public static boolean checkRecord(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='A')
                count++;
        return count<2 && s.indexOf("LLL")<0;

    }

    public static void main(String[] args) {
        String s = "PPALLP";
        System.out.println(checkRecord(s));
    }
}
