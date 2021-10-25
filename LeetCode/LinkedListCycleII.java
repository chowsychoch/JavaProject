package udemy.LeetCode;

import java.util.HashMap;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, ListNode> hm = new HashMap<>();
        int index = 0;
        while (head != null ){
            if (!hm.containsKey(head)){
                hm.put(head, head);
                head = head.next;
            }else{
                return hm.get(head);
            }
        }

        return null;


    }

    private ListNode getIntersect(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if ( slow == fast){
                return slow;
            }
        }


        return null;

    }


    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode Intersect = getIntersect(head);

        if (Intersect == null) {
            return null;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = Intersect;

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;


    }
}
