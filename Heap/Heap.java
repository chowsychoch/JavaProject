package udemy.Heap;

public class Heap {
    /*Heap property
    ==============
    must be a complete binary tree
    must satisfy heap property
    max heap: every parent >= children
    mix heap: every parent <= children
    For node at array[i]
    left child = 2i  + 1
    right child = 2i +2
    parent = floor (i - 1) /2

    Heap good for access min / max value ( root)

    */
    private int[] heap;
    private int size;

    public Heap(int cap){
        heap = new int[cap];
        //System.out.println("s"+size);
    }
    // O log N
    public void insert(int val){
        if (isFull()){
            throw new ArrayIndexOutOfBoundsException("Heap is Full ");
        }
        System.out.println("size is "  + size);
        heap[size] = val;
        //heapify
        fixHeapAbove(size);
        size++;

    }

    public int peek(){
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException("HEap is Empty");

        }
        return heap[0];
    }
    //O log N
    public int delete(int index){
        if ( isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Heap is Empty");
        }
        int parent = getParent(index);
        int deletedValue = heap[index];
        //swap replacement value to the deleted node place
        heap[index] = heap[size - 1 ];
        if ( index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index, size - 1);
        }else{
            fixHeapAbove(index);
        }
        size++;
        return deletedValue;
    }

    public void printHeap(){
        for ( int i = 0 ; i < size ; i++){
            System.out.print(heap[i] +",");
            //System.out.println(", ");
        }
        System.out.println();
    }

    private void fixHeapBelow(int index, int lastHeapIndex){
        int childToSwap;
        System.out.println("last index " + lastHeapIndex);

        while ( index <= lastHeapIndex ){
            int left = getChild(index, true);
            System.out.println("left " + left);
            int right = getChild(index, false);
            System.out.println("right" + right);

            if ( left <= lastHeapIndex){
                if ( right > lastHeapIndex){
                    //no right child, only left child case
                    childToSwap = left;
                }else{
                    //swap it to the child has the largest value
                    childToSwap = (heap[left] > heap[right])? left : right;
                }
                //swap replacement with largest child
                if (heap[index] < heap[childToSwap]){
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                }
                else{
                    break;
                }

                index = childToSwap;

            }else{
                break;
            }


        }
    }
    private void fixHeapAbove(int index){
        int newVal = heap[index];
        // 0 is root check new value against the parent
        while ( index > 0 && newVal > heap[getParent(index)]){
            //assign parent to new value index
            heap[index] = heap[getParent(index)];
            //parent index as current index
            index = getParent(index);

            //not yet assign new value
        }
        heap[index] = newVal;
    }
    public boolean isFull(){
        return size == heap.length;
    }

    public int getParent(int index){
        return (index - 1 ) /2 ;
    }

    public boolean isEmpty(){
        return size == 0 ;
    }

    public int getChild(int index, boolean left){
        return 2 * index + (left ? 1 : 2 );
    }
    //choose a replacement value
    //take the rightmost val,

    // heapify
    // heap above
    // heap below
    // swap replacement value with larger of its children
    // rinse and repeat in both cases until the replacement is in its correct position
    // either up or down

}
