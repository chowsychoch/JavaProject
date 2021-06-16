package udemy.LeetCode;

public class RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedList r = new RemoveDuplicatesfromSortedList();
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode( 2, new ListNode(3, new ListNode(3)))));
        r.deleteDuplicates(l1);
    }
    public ListNode deleteDuplicates(ListNode head) {
        //no element or only one element edge case
        if (head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(-101, head);
        ListNode current  = head;
        ListNode prev = dummy;

        while ( current != null ){
            if ( current.val == prev.val){
                //equal
                //System.out.println("equal");
                prev.next = prev.next.next;
            }else{
                prev = current;
            }
            current = current.next;
        }
        return dummy.next;
    }

}
