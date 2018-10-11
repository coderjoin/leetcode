package array;

/**
 * @author qiaoying
 * @date 2018/9/28 16:26
 */
public class IntToRoman {
    public static String intToRoman(int num) {

        String str = "";
        int i = 1, n;
        while (num > 0){
            n = num % 10;
            num /= 10;
            str = intoCharacter(n , i).concat(str);
            i++;
        }
        return str;

    }
    public static String intoCharacter(int n, int i){
       String str1, str2, str3;
       String str = "";
       if (1 == i){
           str1 = "I";
           str2 = "V";
           str3 = "X";
       }else if (2 == i){
           str1 = "X";
           str2 = "L";
           str3 = "C";
       }else if (3 == i){
           str1 = "C";
           str2 = "D";
           str3 = "M";
       }else {
           str1 = "M";
           str2 = "";
           str3 = "";
       }
        switch(n){         //switch对各数字进行组合以个位上的数举例如下
                     case 0:break;           //空
                     case 1:str+=str1;break;    //I
                     case 2:str+=str1+str1;break;  //II
                     case 3:str+=str1+str1+str1;break;//III
                     case 4:str+=str1+str2;break;     //IV
                     case 5:str+=str2;break;           //V
                     case 6:str+=str2+str1;break;      //VI
                     case 7:str+=str2+str1+str1;break;    //VII
                     case 8:str+=str2+str1+str1+str1;break;    //VIII
                     case 9:str+=str1+str3;break;          //IX
        }
        return str;
    }

    public static void main(String[] args){
       int num = 58;
       String s = intToRoman(num);
       System.out.println(s);
    }
}
