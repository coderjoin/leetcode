package leetcode2020;

/**
 *
 * 描述：在LR字符串中交换相邻字符
 *
 * 两个特点：去掉x后，两边的LR应该是一致的
 *          第n个L不可能移到初始值的右面
 *          第n个R不可能移到初始值的左边
 * @author coderjoin
 * @date 2020-05-27 10:03
 */
public class CanTransform_777 {

    public static boolean canTransform(String start, String end) {
        if (!start.replace("X","")
                .equals(end.replace("X",""))) {
            return false;
        }

        int t = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'L') {
                while (end.charAt(t) != 'L') {
                    t++;
                }
                if (i < t++) {
                    return false;
                }
            }
        }

        t = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'R') {
                while (end.charAt(t) != 'R') {
                    t++;
                }
                if (i > t++) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String start = "RXXLRXRXL", end = "XRLXXRRLX";
        System.out.println(canTransform(start,end));
    }
}
