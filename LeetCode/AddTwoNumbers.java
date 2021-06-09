package udemy.LeetCode;

/**
 * Definition for singly-linked list. */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4));
        //l1.next.next.val = 3;

        ListNode l2 = new ListNode(5, new ListNode(6));
       // l2.next.next.val = 4;
        AddTwoNumbers a = new AddTwoNumbers();
        a.addTwoNumbers(l1,l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyhead = new ListNode(0);
        ListNode l3 = dummyhead;
        int sum = 0;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {

            if (carry != 0) {
                carry = 0;
                sum += 1;
            }

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }


            if (sum > 9) {
                carry = 1;
                sum -= 10;
            }

            if (l3 == null) {
                ListNode rootNode = new ListNode(sum);
                l3.next = rootNode;
                l3 = l3.next;
            } else {
                ListNode newNode = new ListNode(sum);
                l3.next = newNode;
                l3 = l3.next;
            }

            sum = 0;
        }
        return dummyhead.next;

    }
}
