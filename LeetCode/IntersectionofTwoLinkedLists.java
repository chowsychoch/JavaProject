package udemy.LeetCode;

public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {
        IntersectionofTwoLinkedLists r = new IntersectionofTwoLinkedLists();
        ListNode l1 = new ListNode(1, new ListNode(9, new ListNode(1, new ListNode(2, new ListNode(4)))));
        ListNode l2 = new ListNode(3 ,new ListNode(2, new ListNode(4)));
        r.getIntersectionNode(l1,l2);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a_pointer = headA;
        ListNode b_pointer = headB;

        while (a_pointer != b_pointer){
            if (a_pointer == null ){
                a_pointer = headB;
            }else{
                a_pointer = a_pointer.next;
            }

            if( b_pointer == null){
                b_pointer = headA;
            }else{
                b_pointer = b_pointer.next;
            }
        }
       // System.out.println(a_pointer.val);
        return a_pointer;
    }

}
