package string;

/**
 * Created by qiaoying on 2018/5/12.
 */
public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        boolean repeated = false;
        for(int i=0;i<s.length();i++){
            repeated = false;
            int j=0;
            for(;j<s.length();j++){
                if(j!=i&&s.charAt(j)==s.charAt(i)){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                return i;
            }

        }

        return  -1;
    }

    public static void main(String[] args){
        String s = "leetcode";
        int a = firstUniqChar(s);
        System.out.println(a);
    }
}
