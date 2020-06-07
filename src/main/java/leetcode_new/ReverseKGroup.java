package leetcode_new;

/**
 * @author qiaoying
 * @date 2019/11/12 21:27
 *
 *
 *
 *   每隔K个元素翻转链表
 */
public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode node = new ListNode(0);
        node.next = head;
        int count = 0;
        ListNode pre = node;
        ListNode cur = head;
        while (cur != null) {
            count++;
            ListNode next = cur.next;
            if (count == k) {
                pre = reverse(pre, next);
                count = 0;
            }
            cur = next;
        }
        return node.next;
    }

    private ListNode reverse(ListNode pre, ListNode end) {
        if (pre == null || pre.next == null) {
            return pre;
        }
        ListNode head = pre.next;
        ListNode cur = pre.next.next;
        while (cur != head) {
            ListNode next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        head.next = end;
        return end;
    }

}
