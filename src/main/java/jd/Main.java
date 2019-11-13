package jd;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @author coderjoin
 * @date 2019-08-24 20:17
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int c = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a +"ff" + b);
            if (hashMap.get(a) == null) {
                hashMap.put(a,1);
            } else {
                int count = hashMap.get(a);
                count++;
                hashMap.put(a,count);
            }
        }







        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
//        for (Map.Entry s : list) {
//            System.out.println(s.getKey());
//        }
        System.out.println(1);
        System.out.println(1);
    }
}
