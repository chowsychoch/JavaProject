package udemy.LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
        private Node head;
        private int length;

        public static void main(String[] args) {
                MyLinkedList my = new MyLinkedList();
                //Test Case 1
                my.addAtHead(1);
                my.addAtTail(3);
                my.addAtIndex(1,2);
                my.get(1);
                my.deleteAtIndex(1);
                my.get(1);
                //Test Case 1 end

        }

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

                if(index<0 || index>=length)
                        return -1;
                Node node=head;
                for(int i=0;i<index;i++){
                        node=node.next;
                }
                System.out.println(node.value);
                return node.value;

        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
                Node newNode = new Node(val);
                newNode.next = head;
                head = newNode;
                length++;
                printList();
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
                printList();

        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {

                if ( this.length == index){
                        addAtTail(val);
                }
                else if ( index == 0){
                        addAtHead(val);
                }
                else if ( this.length < index || index < 0){
                        return;
                }
                else {

                        Node current = head;
                        Node newNode = new Node(val);
                        for (int i =0; i < index - 1 ; i++){
                                current = current.next;

                        }
                        newNode.next = current.next;
                        // 1 -- > 2 --- > 3
                        //        4 --- >3
                        current.next = newNode;
                        // 1 --- > 2 -----> 4 -- > 3
                        length++;
                        printList();

                }

        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
                if(index<length&&index>=0){
                        length--;
                        Node dmy = new Node(0);
                        dmy.next = head;
                        Node cur = dmy;
                        while(index>0){
                                cur = cur.next;
                                index--;
                        }
                        cur.next = cur.next.next;
                        head = dmy.next;
                        //printList();
                }
                else return;

        }

        private void printList() {
                List res = new LinkedList<>();
                Node curr = head;

                while ( curr != null){
                        res.add(curr.value);
                        curr = curr.next;
                }
                System.out.println(Arrays.asList(res));
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
