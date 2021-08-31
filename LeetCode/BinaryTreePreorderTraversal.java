package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;

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
}
