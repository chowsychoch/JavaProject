package udemy.LeetCode;

public class ReverseLinkedListII {
    public static void main(String[] args) {
        ReverseLinkedListII r = new ReverseLinkedListII();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
       // r.reverseBetween(l1, 2,4);
        //r.reverseBetweenII(l1,2,4);
        r.reverseBetweenIII(l1,2,4);
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

    public ListNode reverseBetweenII(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1, head);
        ListNode current = dummy;
        ListNode prev = null;

        for (int i =0; i < left -1 ;i++){
            current = current.next;
        }

        prev  = current;
        current = current.next;

        for (int i =0; i < right - left; i++){
            ListNode next = current.next;
            current.next  = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        System.out.println(dummy.next.val);
        return dummy.next;

    }

    public ListNode reverseBetweenIII(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1, head);
        ListNode current = dummy;
        ListNode prev = null;
        for (int i =0; i < left -1 ; i++){
            current = current.next;
        }
        prev = current;
        ListNode beforeNode = current;
        ListNode newSubTail = current.next;

        current = current.next;
        System.out.println("current" +current.val);

        for (int i=0; i <= right -left ; i++){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        System.out.println(prev.val);
        System.out.println(current.val);

        if (beforeNode != null){
            beforeNode.next = prev;
        }

        newSubTail.next = current;
        //System.out.println(head.next.next.val);
        return dummy.next;
    }


    }
