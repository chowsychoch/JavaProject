class Node{
        int val;
        Node next;
        public Node(int val){
                this.val = val;
        }
}


class MyLinkedList {
        Node head;
        int size;

        public MyLinkedList() {
                head = new Node(0);
                size = 0;
        }

        public int get(int index) {

                if (index >= size || index < 0)return -1;

                Node trav = head;
                for (int i = 0; i < index + 1; ++i){
                        trav = trav.next;
                }

                return trav.val;

        }

        public void addAtHead(int val) {
                addAtIndex(0, val);

        }

        public void addAtTail(int val) {
                addAtIndex(size, val);
        }

        public void addAtIndex(int index, int val) {
                if (index > size || index < 0)return;
                size++;
                Node trav = head;
                for (int i = 0; i < index; i++){
                        trav = trav.next;
                }

                Node newNode = new Node(val);
                newNode.next = trav.next;
                trav.next = newNode;


        }

        public void deleteAtIndex(int index) {
                if (index >= size || index < 0) return;

                size--;
                Node trav = head;
                for (int i = 0; i < index ; i++){
                        trav = trav.next;
                }
                trav.next = trav.next.next;
        }
}