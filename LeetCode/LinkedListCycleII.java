package udemy.LeetCode;

import java.util.HashMap;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, ListNode> hm = new HashMap<>();
        int index = 0;
        while (head != null ){
            if (!hm.containsKey(head)){
                hm.put(head, head);
                head = head.next;
            }else{
                return hm.get(head);
            }
        }

        return null;


    }
}
