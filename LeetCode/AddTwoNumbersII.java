package udemy.LeetCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class AddTwoNumbersII {
    public static void main(String[] args) {
        AddTwoNumbersII a = new AddTwoNumbersII();
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        a.addTwoNumbers(l1,l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);
        System.out.println(l1.val);
        System.out.println(l2.val);

        return  l1;


    }

    private ListNode reverseLinkedList(ListNode l1){
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;

        while ( l1 != null){
            ListNode tmp = l1.next;
            l1.next = l3.next;
            l3.next = l1;
            l1 = tmp;

        }
        System.out.println(dummyHead.next);
        return dummyHead.next;
    }
}
