package classical;

/**
 * @author coderjoin
 * @date 2019-07-10 14:38
 */
public class LinkListReverse {
    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode p = head.next;
        ListNode pre = head;
        pre.next = null;
        ListNode next = p.next;
        while (p != null) {
            p.next = pre;
            pre = p;
            p = next;
            if (p != null) {
                next = p.next;
            }
        }
        head = pre;
        return head;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println(reverse(node1).val);

    }
}
