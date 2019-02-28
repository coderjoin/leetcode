package offer;

import java.util.TreeSet;

/**
 * @author qiaoying
 * @date 2019-02-28 18:35
 */
public class PrintMinNumber {
    public  String PrintMinNumber(int [] numbers) {

        if (numbers.length == 0) {
           return "";
        }
        TreeSet<String> set = new TreeSet<>();
        PrintMinNumber(numbers, 0 ,set);
        return set.pollFirst();
    }

    public void PrintMinNumber(int[] numbers, int index, TreeSet<String> set) {
        if (index == numbers.length - 1) {
            String tmp = "";
            for (int i = 0; i < numbers.length; i++) {
                tmp += String.valueOf(numbers[i]);
            }
            set.add(tmp);
        } else {
            for (int i = index; i < numbers.length; i++) {
                swap(numbers,index,i);
                PrintMinNumber(numbers,index + 1, set);
                swap(numbers,index, i);
            }

        }
    }

    public void swap(int[] numbers, int i, int j) {
        int tmp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {3, 32, 321};
        PrintMinNumber p = new PrintMinNumber();
        System.out.println(p.PrintMinNumber(a));

    }
}
