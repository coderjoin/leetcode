package leetcode2020;

/**
 *
 * 描述：删除排序链表中的重复元素2
 * @author coderjoin
 * @date 2020-05-31 19:10
 */
public class DeleteDuplicates_82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //建一个哑巴结点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode a = dummy;
        ListNode b = head;
        while (b != null && b.next != null) {
            //一个结点和第二个结点
            if (a.next.val != b.next.val) {
                a = a.next;
                b = b.next;
            } else {
                while (b != null && b.next != null && a.next.val == b.next.val) {
                    b = b.next;
                }
                a.next = b.next;
                b = b.next;
            }

        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        System.out.println(deleteDuplicates(node1).val);
    }
}
