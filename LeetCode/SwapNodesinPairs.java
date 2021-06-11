package udemy.LeetCode;

public class SwapNodesinPairs {


    public ListNode swapPairs(ListNode head) {
        ListNode dummyhead = new ListNode(0,head);
        ListNode prev = dummyhead;
        ListNode current = head;


        while (current != null && current.next !=null){
            ListNode nextPair = current.next.next;
            ListNode second = current.next;

            second.next = current;
            current.next = nextPair;
            prev.next = second;

            //update
            prev = current;
            current = nextPair;

        }

        return dummyhead.next;

    }
}
