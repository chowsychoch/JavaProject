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
        a.reverseNode(l1);
        a.addTwoNumbers(l1,l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);
        System.out.println(l1.val);
        System.out.println(l2.val);
        int carry =0 ;
        int sum = 0;
        ListNode dummyhead = new ListNode(0);
        ListNode l3 = dummyhead;

        while ( l1 != null || l2 != null || carry != 0){

            if (carry != 0){
                sum+=1;
                carry = 0;
            }
            if ( l1 != null){
                sum+=l1.val;
                l1 = l1.next;
            }

            if ( l2 != null){
                sum+=l2.val;
                l2 = l2.next;
            }

            if ( sum > 9){
                sum-=10;
                carry = 1;
            }

            ListNode newNode = new ListNode(sum);
            l3.next = newNode;
            l3 = l3.next;
            sum = 0;

        }
        //System.out.println("result "+dummyhead.next.next.next.val);
        dummyhead = reverseLinkedList(dummyhead.next);
        System.out.println(dummyhead.next.val);
        return  dummyhead;


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

    public ListNode reverseNode(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        System.out.println("node"+node.val);
        return node;
    }
}
