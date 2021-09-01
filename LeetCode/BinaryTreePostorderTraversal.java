package udemy.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    List<Integer> res = new LinkedList<>();
    List<Integer> arr = new ArrayList<>();

    //recursion approach
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null )return res;
        //visit left
        if (root.left != null){
            postorderTraversal(root.left);
        }
        //visit right
        if (root.right !=null){
            postorderTraversal(root.right);
        }
        //visit data
        res.add(root.val);

        return res;
    }
    public List<Integer> postorderTraversalRe(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        if ( root == null)return arr;
        stack.push(root);
        System.out.println(stack.peek());

        while ( ! stack.isEmpty()){
            TreeNode current = stack.pop();
            arr.add(0, current.val);

            if ( current.left != null){
                stack.push(current.left);
            }
            if ( current.right != null){
                stack.push(current.right);
            }

        }
        return res;
    }

}
