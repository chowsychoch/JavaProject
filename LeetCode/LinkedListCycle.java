package udemy.LeetCode;


import java.util.HashSet;

public class LinkedListCycle {

    static ListNode head;

     //Definition for singly-linked list.
     static class ListNode {
          int val;
          ListNode next;

          ListNode(int x) {
              val = x;
              next = null;
          }
      }

      static public void push(int new_data) {
          ListNode newNode = new ListNode(new_data);

          newNode.next = head;

          head = newNode;
      }

    public boolean hasCycle() {

        if ( head == null)return false;
        ListNode fast = head.next;
        ListNode slow = head;

        while ( slow != fast ){

            if ( fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public boolean hasCycleV2(){
         ListNode slow = head;
         ListNode fast = head;
         while ( slow.next != null && fast.next.next != null){
             fast = fast.next.next;
             slow = slow.next;

             if ( fast == slow){
                 return true;
             }
         }
         return false;
    }

    public boolean hasCycleV3(){
        HashSet<ListNode> h = new HashSet();
        if ( head == null )return false;
        if ( head.next == null) return false;

        while ( head != null){
            if (h.contains(head)){
                return true;
            }else{
                h.add(head);
                head = head.next;
            }
        }
        return false;
    }
}
