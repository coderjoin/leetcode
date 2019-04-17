package self;

/**
 * @author qiaoying
 * @date 2019-04-17 10:19
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode list1 = headA;
        ListNode list2 = headB;
        int length1 = 0;
        int length2 = 0;
        while (list1 != null) {
            length1++;
            list1 = list1.next;
        }
        while (list2 != null) {
            length2++;
            list2 = list2.next;
        }

        if (length1 > length2) {
            int gap = length1 - length2;
             list1 = headA;
             list2 = headB;
            for (int i = 0; i < gap; i++) {
                list1 = list1.next;
            }

        } else {
            int gap = length2 - length1;
            list1 = headA;
            list2 = headB;
            for (int i = 0; i < gap; i++) {
                list2 = list2.next;
            }

        }
        while (list1 != list2 ) {
            list1 = list1.next;
            list2 = list2.next;
        }

        return list1;

    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(1);
        ListNode node8 = new ListNode(1);
    }
}
