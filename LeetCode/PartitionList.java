package udemy.LeetCode;

public class PartitionList {
    public static void main(String[] args) {
        PartitionList p = new PartitionList();
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2))))));
        p.partition(l1, 3);
    }
    public ListNode partition(ListNode head, int x) {
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;

        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        ListNode current = head;

        while ( current != null){
            if ( current.val < x){
                before.next = current;
                before = before.next;
            }else{
                after.next = current;
                after = after.next;
            }
            current = current.next;
        }

        after.next = null;
        before.next = after_head.next;
        return before_head.next;
    }
}
