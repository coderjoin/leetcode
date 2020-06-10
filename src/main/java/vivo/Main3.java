package vivo;

/**
 * @author coderjoin
 * @date 2020-06-07 15:26
 */
import java.util.*;

public class Main3 {

    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (scanner.hasNextLine() && num >= 0) {
            lines.add(scanner.nextLine());
            num--;
        }


        // TODO output
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < lines.size(); i++) {
            String[] array = lines.get(i).split(" ");
            for (int j = 0; j < array.length; j++) {
                queue.add(Integer.parseInt(array[j]));
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll() + " ");
        }
        System.out.println(sb.toString());


    }

    static class ListNode {
        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


//    private static ListNode mergeNodes(ListNode head ) {
//
//        // write your code here
//
//    }


}
