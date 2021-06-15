package udemy.LeetCode;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        m.mergeTwoLists(l1, l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while ( l1 != null && l2 != null){
            if ( l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;

        }
        if ( l1 != null ){
            current.next = l1;
        }

        if ( l2 != null){
            current.next = l2;
        }
        return dummy.next;

    }
}
