package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    List<Integer> res = new LinkedList<>();
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


}
