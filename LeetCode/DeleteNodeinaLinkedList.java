package udemy.LeetCode;

public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
            node.next.val = node.val;
            node.next = node.next.next;

    }
}
