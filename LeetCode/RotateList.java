package udemy.LeetCode;

public class RotateList {

    public static void main(String[] args) {
        RotateList r = new RotateList();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode l2 = new ListNode(0, new ListNode(1, new ListNode(2)));
        r.rotateRight(l2,4);
    }


    public ListNode rotateRight(ListNode head, int k) {
        if ( head == null || k == 0){
            return head;
        }
        ListNode tail = head;
        int length = 1;
        while ( tail.next != null){
            tail = tail.next;
            length++;
        }
        //link the null to head make it circular
        tail.next = head;

        int endNodeIndex = length - k % length;
        System.out.println("has to go by " + endNodeIndex);
        System.out.println("tail is " + tail.val);
        ListNode newTail = tail;
        while ( endNodeIndex >0){
            newTail = newTail.next;
            endNodeIndex--;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;


        System.out.println(newHead.val);
        return newHead;


    }
}
