package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//LeetCode 589 // DFS
public class NaryTreePreorderTraversal {
    List<Integer> res = new LinkedList<>();
    //recursive
    public List<Integer> preorder(Node root){
        // empty then return
        if (root == null) return res;
        // preorder add val first
        res.add(root.val);
        // visit its children
        for (Node child:root.children){
            //recursive call
            preorder(child);
        }
        return res;
    }

    //iterative
    public List<Integer> preorder2(Node root) {
        if (root == null)return res;

        Stack<Node> stack = new Stack<>();

        stack.add(root);

        while ( !stack.isEmpty()){
            Node curr = stack.pop();
            res.add(curr.val);
            for ( int i = curr.children.size() -1 ; i >= 0 ; i--){
                stack.add(curr.children.get(i));
            }
        }
        return res;

    }
}
