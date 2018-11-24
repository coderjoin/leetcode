package leetcode;

import java.util.HashMap;

/**
 * @author qiaoying
 * @date 2018/11/25 00:26
 */
public class RoomToInt_13 {

    public static int romanToInt(String s){

        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);

        int res = 0;
        int value = 0;
        int tmp = 0;
        char[] array = s.toCharArray();
        for (int i = array.length - 1; i >= 0; i--){
            value = hashMap.get(array[i]);
            if (tmp <= value){
                res += value;
                tmp = value;
            }else {
                res -= value;
                tmp = value;
            }
        }

        return res;

    }


    public static void main(String[] args){

        String s = "IX";
        System.out.println(romanToInt(s));
    }
}
