package list;

public class DeleteNode {
    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }


    public static void main(String[] args){
        ListNode node = new ListNode(4);
    }
}
