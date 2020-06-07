package leetcode2020;

/**
 * @author coderjoin
 * @date 2020-06-02 15:57
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        //双指针非递归
        ListNode pre = null; //空指针
        ListNode cur = head;
        ListNode tmp = null;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }


    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
