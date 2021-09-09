package udemy.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);
        //look at the first root node
        System.out.println(pq.peek());
        // remove the first node
        System.out.println(pq.remove());
        //remove with value
        System.out.println(pq.remove(429));

        System.out.println(pq.peek());
        //remove the first node poll = remove
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        Object[] ints = pq.toArray();
        for ( Object num:ints){
            System.out.println("N "+num);
        }

    }
}
