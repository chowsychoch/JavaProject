package udemy.DFS;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DFS {

    public DFS(Node start ){
        Stack<Node> s = new Stack();
        //Choose the data structure
        Set<Node> seen = new HashSet();
        s.push(start);
        // while it is not empty
        while ( !s.isEmpty()){
            //poll a node
            Node node  = s.pop();
            //Process if not seen
            if ( !seen.contains(node)){
                seen.add(node);
                System.out.println("Node " + node.val);
            }
            //Add unseen children
            for (Node adj: node.children){
                if( !seen.contains(adj)){
                    s.push(adj);
                }
            }

        }

    }
}
