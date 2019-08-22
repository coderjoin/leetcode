package yuan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author coderjoin
 * @date 2019-08-03 19:21
 */
public class Main {
    public String decodeString(String s) {

        Stack<String> stack=new Stack<String>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==')') {
                String string="";
                while(!stack.peek().equals("(")) {
                    string=stack.pop()+string;
                }
                stack.pop();

                String countString="";
                while((!stack.isEmpty())&&(stack.peek().charAt(0)>='0'&&stack.peek().charAt(0)<='9')) {
                    countString=stack.pop()+countString;
                }
                int count=Integer.parseInt(countString);

                String retString="";
                for(int j=0;j<count;j++) {
                    retString=retString+string;
                }
                stack.push(retString);
            }
            else {
                String str=""+s.charAt(i);
                stack.push(str);
            }
        }

        String aaa="";
        while(!stack.isEmpty()) {
            aaa=stack.pop()+aaa;
        }
        return aaa;
    }



    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.decodeString("A11B"));
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int len = 0;
//        ArrayList<String> list = new ArrayList<>();
//        while (sc.hasNextLine() && len < num) {
//            String str = sc.nextLine();
//            list.add(str);
//            len++;
//        }
//        for (String str:list) {
//            char[] array = str.toCharArray();
//            StringBuilder result = new StringBuilder();
//
//            for (int i = 0; i < array.length; i++) {
//                Stack<Character> stack = new Stack<>();
//                if (Character.isAlphabetic(array[i]) || array[i] == '(') {
//                    stack.push(array[i]);
//                }
//                if (array[i] == ')') {
//
//                }
//
//            }
//        }
    }
}
