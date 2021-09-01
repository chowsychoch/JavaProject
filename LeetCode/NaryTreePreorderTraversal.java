package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class NaryTreePreorderTraversal {
    List<Integer> res = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        if ( root == null)return res;
        Node curr = root;
        //visit data
        res.add(curr.val);
        //visit children
        if (curr.children != null){
            curr = curr.children.get(0);
            preorder(curr.children.get(0));
        }

    }
}
