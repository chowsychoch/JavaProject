package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    List<Integer> res = new LinkedList<>();

    public static void main(String[] args) {
    }

    //Recursive Approach
    public List<Integer> preorderTraversal(TreeNode root) {
        if ( root == null) return res;
        // visit data
        res.add(root.val);
        // visit left
        if (root.left !=null){
            preorderTraversal(root.left);
        }
        // visit right
        if ( root.right !=null){
            preorderTraversal(root.right);
        }
        return res;
    }

    //Iterative Approach
    public List<Integer> preorderTraversal2 (TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()){
            //visit left
            while ( current != null){
                //visit data
                res.add(current.val);
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            //visit right
            current = current.right;
        }
        return res;
    }

}
