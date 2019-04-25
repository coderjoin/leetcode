package self;

/**
 * @author qiaoying
 * @date 2019-04-25 14:24
 */
public class Convert {
    public static String convert(String s, int numRows) {
        if (s==null || s.length() <= 1 || numRows == 1)
            return s;
        int temp = 2*numRows - 2;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            //此时的k相当于上面的k*temp
            for(int k = 0; k + i < s.length(); k += temp){
                //本来弄了很多注释，后来全删了，感觉还是不要弄注释了吧
                //假如不理解的话可以找几个字符串自己模拟想象下
                str.append(s.charAt(k+i));
                //如果是中间行则需要再加上一个字符
                if(i != 0 && i != numRows-1 && k + temp - i < s.length()){
                    str.append(s.charAt(k+temp-i));
                }
            }
        }
        return str.toString();

    }

    public static void main(String[] args) {
        String s = "LEETCODEISHIRING";
        int numRows = 3;
        System.out.println(convert(s,numRows));
    }
}
