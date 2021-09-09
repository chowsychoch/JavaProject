package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NaryTreePostorderTraversal {
    List<Integer> res = new LinkedList<>();
    LinkedList<Integer> res1 = new LinkedList<>();

    //recursive
    public List<Integer> postorder(Node root) {
        if  (root == null)return res;
        //visit children
        Node curr = root;
        for (Node child: curr.children){
            postorder(child);
            //res.add(child.val);
        }
        res.add(curr.val);
        //visit self
        return res;
    }

    public List<Integer> postorder2(Node root){
        Stack<Node> stack = new Stack<>();
        //edge case
        if (root == null) return res;
        //stack
        stack.add(root);
        //
        while ( !stack.isEmpty()){
            Node curr = stack.pop();
            res1.addFirst(curr.val);
            for (int i = 0  ; i <= curr.children.size() -1  ; i++){
                stack.add(curr.children.get(i));
            }
        }
        return res1;
    }
}
