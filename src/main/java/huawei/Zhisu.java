package huawei;

import java.util.Scanner;

public class Zhisu {
    public static String getResult(long ulDataInput){
        StringBuffer output = new StringBuffer();
        int[] flag = new int[(int)ulDataInput];
        for(int i = 2; i * i < ulDataInput; i++){
            if(flag[i] == 0){
                for(int j = i; i * j < ulDataInput; j++){
                    flag[i * j] = 1;
                }
            }

        }

        for(int i = 2; i < ulDataInput; i++){
            if(flag[i] == 0){

                output.append(i+" ");
                //System.out.println(i);
            }
        }
        return output.toString();
    }
    public static void main(String[] args){
        //long input = 180;
        //System.out.println(getResult(input));
        int i = 5;
        int s=(i++)+(++i)+(i--)+(--i);
        System.out.println(s);
    }
}
