package udemy.DFS;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFS {
    public BFS(Node start){
        Queue<Node> queue = new LinkedList<>();
        Set<Node> seen = new HashSet<>();
        //Add start to the search
        queue.add(start);
        while ( !queue.isEmpty()){
            Node curr = queue.poll();
            //Process if not seen
            if(!seen.contains(curr)){
                seen.add(curr);
                System.out.println(curr);
            }
            //All unseen children
            for (Node adj: curr.children){
                if(!seen.contains(adj)){
                    seen.add(adj);
                }
            }
        }
    }
}
