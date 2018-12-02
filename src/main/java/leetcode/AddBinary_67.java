package leetcode;

/**
 * @author qiaoying
 * @date 2018/11/26 20:18
 */
public class AddBinary_67 {

    public static String addBinary(String a, String b){
        StringBuilder result = new StringBuilder();

        int al = a.length()-1;
        int bl = b.length()-1;
        int carry = 0;

        while( al >=0  || bl >=0 )
        {
            int sum = carry;
            if(al >= 0)
            {
                sum += (a.charAt(al) - '0');
                al--;
            }
            if(bl >= 0)
            {
                sum += (b.charAt(bl) - '0');
                bl--;
            }
            result.append(sum%2);   //相加结果
            carry = sum /2;         //进位，如果是1那么carry=0，如果是2则要进位给下面一位+1
        }

        if(carry !=0 )              //都相加完了，还要进位的情况
            result.append(1);

        return result.reverse().toString();  //先反转，再输出


    }

    public static void main(String[] args){
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(addBinary(a,b));
    }
}
