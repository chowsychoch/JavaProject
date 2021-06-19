package udemy.LeetCode;

public class RemoveDuplicatesfromSortedListII {

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedListII r = new RemoveDuplicatesfromSortedListII();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        r.deleteDuplicates(l1);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101, head);
        ListNode current = head;
        ListNode prev = dummy;
        if ( head == null || head.next == null)return head;
        while ( current != null){
            if ( current.next !=null && current.val == current.next.val){
                while ( current.next != null && current.val == current.next.val){
                    current = current.next;
                }
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
        }
        System.out.println(dummy.next.next.val);
        return dummy.next;

    }
}
