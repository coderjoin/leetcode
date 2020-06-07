package pdd;

import java.util.*;

/**
 * @author coderjoin
 * @date 2019-12-05 19:11
 */
public class Now1 {

    public int max = 0;
    public int min = 0;

    static class Interval {
        int start;
        int end;
        Interval() {
            start = 0;
            end = 0;
        }
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            array.add(start);
            array.add(end);
            Interval interval = new Interval(start,end);
            list.add(interval);
        }

        Collections.sort(list, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        Collections.sort(array);

        Now1 now1 = new Now1();

        if (now1.hasMax(list,k,array) && now1.hasMin(list,k,array)) {
            System.out.println(now1.min + " " + now1.max);
        } else {
            System.out.println("error");
        }


    }
    
    public static boolean isInside(int target, int start, int end) {
        if (target >= start && target <= end) {
            return true;
        } 
        return false;
    }

    public boolean hasMin(List<Interval> list, int k,ArrayList<Integer> array) {
        int count = 0;
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < array.size(); i++) {
                if (isInside( array.get(i), list.get(j).start, list.get(j).end)) {
                    count++;
                    if (count == k) {
                        min = array.get(i);
                        return true;
                    }
                }

            }
            count = 0;
        }
        return false;
    }

    public  boolean hasMax(List<Interval> list, int k,ArrayList<Integer> array) {
        int count = 0;
        for (int j = list.size() - 1; j >= 0 ; j--) {
            for (int i = array.size() -1; i >= 0 ; i--) {
                if (isInside(array.get(i), list.get(j).start, list.get(j).end)) {
                    count++;
                    if (count == k) {
                        max = array.get(i);
                        return true;
                    }
                }

            }
            count = 0;
        }
        return false;
    }

}
