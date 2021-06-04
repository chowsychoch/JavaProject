package udemy.LeetCode;

public class MyLinkedList {
        Node head;
        int length;

        /** Initialize your data structure here. */
        public MyLinkedList() {
                Node head = null;
                int length = 0;

        }

        static class Node{
                int value;
                Node next;
                Node(int v ){
                     value = v;
                     next = null;
                }
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
                if ( index > length) return -1;
                int count = 0;

                while ( count <= index){
                        if ( count == index){
                                return head.value;
                        }
                        head = head.next;
                        count++;
                }
                return -1;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
                Node newNode = new Node(val);

                if (head == null){
                        head = newNode;
                }else{
                        newNode.next = head;
                        head = newNode;
                        length++;
                }


        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
                Node newNode = new Node(val);

                if (head == null){
                        head = newNode;
                }else{
                        Node current = head;
                        while ( current.next != null){
                                current = current.next;
                        }
                        current.next = newNode;
                }
                length++;

        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {



        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {

        }


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
