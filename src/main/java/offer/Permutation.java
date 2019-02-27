package offer;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author qiaoying
 * @date 2019-02-27 21:56
 */
public class Permutation {
    ArrayList<String> result = new ArrayList<String>();
    TreeSet<String> set = new TreeSet<String>();
    public  ArrayList<String> permutation(String str) {

        char[] chars = str.toCharArray();
        permutayion(chars, 0);
        while (set.isEmpty() != true) {
            result.add(set.pollFirst());
        }
        return result;
    }

    public  void permutayion(char[] array, int index) {
        if (index == array.length - 1) {
            set.add(String.valueOf(array));
        } else {
            for (int i = index; i < array.length; i++) {
                swap(array, index, i);
                permutayion(array, index + 1);
                swap(array, index, i);
            }
        }
    }

    public void swap(char[] array, int i, int j) {
        char ch = array[i];
        array[i] = array[j];
        array[j] = ch;
    }

    public static void main(String[] args) {
        String a = "abc";
        Permutation p = new Permutation();
        int b = p.permutation(a).size();
        System.out.println(b);
    }
}
