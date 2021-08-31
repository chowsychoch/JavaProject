package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
    }

    List<Integer> res = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        //System.out.println(root.val);
        res.add(root.val);
        //System.out.println(res);
        if (root.right != null) {
            inorderTraversal(root.right);
        }

        return res;
    }
    //iterative approach --fail case
    public List<Integer> inorderTraversal2(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        if ( root == null) return res;

        TreeNode current = root;

        while ( current != null || !s.isEmpty()){
            while (current.left != null ){
                s.push(current);
                current = current.left;
            }
            res.add(current.val);
            current = s.pop();
            current = current.right;
        }
        return res;
    }
    //iterative approach
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        helperFunc(root ,res);
        return res;
    }

    public void helperFunc(TreeNode root,List<Integer> res ){
        Stack<TreeNode> stack = new Stack<>();
        //if ( root == null ) return ;
        TreeNode current = root;

        while ( current != null || !stack.isEmpty()){
            while (current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            res.add(current.val);
            current = current.right;
        }

    }


}