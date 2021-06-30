package udemy.LeetCode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        if (head == null)return head;
        ListNode current = head;
        ListNode prev = dummy;
        while (current !=null){
            if(current.val == val){
                ListNode next = current.next;
                prev.next = next;
            }else{
                prev = current;
            }
            current = current.next;
        }

        return  dummy.next;
    }
}
