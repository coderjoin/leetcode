package self;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-04-22 15:36
 */
class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
}
public class Merge {

    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<>();
        if (intervals == null || intervals.size() < 1) {
            return result;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        Interval pre = null;
        for (Interval i:intervals) {
            if (pre == null || pre.end < i.start) {
                result.add(i);
                pre = i;
            } else if (pre.end < i.end) {
                pre.end = i.end;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Interval> num = new ArrayList<Interval>();
        Interval in1 = new Interval(1, 3);
        Interval in2 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(13, 20);
        num.add(in1);
        num.add(in2);
        num.add(in3);
        num.add(in4);

        List<Interval> list = merge(num);

    }
}
