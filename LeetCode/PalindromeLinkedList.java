package udemy.LeetCode;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        PalindromeLinkedList p = new PalindromeLinkedList();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        p.isPalindrome(l1);
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null )return false;
        ListNode dummy = new ListNode(0, head);
        ListNode fast = head;
        ListNode slow = head;

        while ( fast != null && fast.next !=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        //fast should be null or fast.next should be null
        ListNode prev = null;
        while ( slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        slow = prev;
        fast = head;

        while ( slow != null){
            if( slow.val != fast.val){
                //System.out.println("F");
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        //System.out.println("True");
        return true;
    }
}
