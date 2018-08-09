package list;

public class ReverseList {
    //非递归实现
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
        return head;
        }
        ListNode h = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return h;
    }
}
