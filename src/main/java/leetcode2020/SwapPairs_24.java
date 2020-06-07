package leetcode2020;

/**
 *
 * 描述：两两交换链表中的节点
 *
 *
 * @author coderjoin
 * @date 2020-05-31 19:38
 */
public class SwapPairs_24 {


    public ListNode swapPairs(ListNode head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairs(second.next);
        second.next = first;

        return second;
    }



}
