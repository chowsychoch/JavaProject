package udemy.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreePreorderTraversal {
    List<Integer> res = new LinkedList<>();

    public List<Integer> preorder(Node root){
        List<Integer> result = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if (root == null) return result;

        q.add(root);

        while (!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size ; i++){
                Node curr = q.poll();
                result.add(curr.val);
                for (Node child: curr.children){
                    q.add(child);
                }
            }
        }
        return result;
    }

    public List<Integer> preorder2(Node root) {
        if ( root == null)return res;
        Node curr = root;
        //visit data
        res.add(curr.val);
        //visit children
        if (curr.children != null){
            curr = curr.children.get(0);
            preorder(curr.children.get(0));
        }
        return res;
    }
}
