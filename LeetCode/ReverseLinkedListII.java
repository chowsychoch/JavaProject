package udemy.LeetCode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        r.reverseBetween(l1, 2,4);
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = head;
        ListNode prev = dummy;
        // find the left node before
        for (int i =0 ; i < left - 1; i++) prev = prev.next;
        //
        current = prev.next;
        for (int i = 0; i < right -left; i++){
            ListNode next = current.next;
            current.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }


       // System.out.println("dum " + dummy.next.next.val );
        return dummy.next;
    }
}
