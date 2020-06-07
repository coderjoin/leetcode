package leetcode2020;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 *
 * 描述：合并k个排序链表
 *
 *
 * @author coderjoin
 * @date 2020-06-02 20:02
 */
public class MergeKLists_23 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(
                new Comparator<ListNode>() {
                    @Override
                    public int compare(ListNode o1, ListNode o2) {
                        return o1.val - o2.val;
                    }
                }
        );
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                queue.add(lists[i]);
                lists[i] = lists[i].next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        while (!queue.isEmpty()) {
            dummy.next = queue.poll();
            dummy = dummy.next;
        }
        dummy.next = null;
        return head.next;
    }


    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return helper(lists, 0, lists.length - 1);

    }

    private ListNode helper(ListNode[] lists, int begin, int end) {
        if (begin == end) {
            return lists[begin];
        }
        int mid = begin + (end - begin) /2;
        ListNode left = helper(lists, begin, mid);
        ListNode right = helper(lists, mid + 1, end);
        return merge(left,right);
    }

    private ListNode merge(ListNode a,ListNode b) {
        if (a == null || b == null) {
            return (a == null) ? b :a;
        }
        if (a.val <= b.val) {
            a.next = merge(a.next,b);
            return a;
        } else {
            b.next = merge(a,b.next);
            return b;
        }
    }

    public static void main(String[] args) {

    }
}
