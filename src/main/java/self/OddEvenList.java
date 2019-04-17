package self;

/**
 * @author qiaoying
 * @date 2019-04-17 14:01
 */
public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode odd  = head;
        ListNode even = head.next;
        ListNode evenhead = even;
        while (odd.next != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }

    public static void main(String[] args) {

    }
}
