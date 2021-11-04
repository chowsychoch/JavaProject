package udemy.LeetCode;

public class ReversedLinkedList {
    public static void main(String[] args) {
        ReversedLinkedList r = new ReversedLinkedList();
        ListNode l1 = new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(5)))));

        r.reverseList(l1);
    }
    public ListNode reverseList(ListNode head) {
        ListNode dummyhead = new ListNode(0, head);
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while ( current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        dummyhead.next = prev;
        return dummyhead.next;
    }

    public ListNode reverseListII(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr!= null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }
}
