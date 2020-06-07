package leetcode2020;

/**
 *
 * 描述：删除链表重复元素
 * @author coderjoin
 * @date 2020-05-31 11:49
 */
public class DeleteDuplicates_83 {


    public static ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.next.val == p.val) {
                p.next = p.next.next;
            }else {
                p = p.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        System.out.println(deleteDuplicates(node1).val);
    }
}
