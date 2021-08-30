package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
    }
    List<Integer> res = new LinkedList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if ( root == null){
            return res;
        }
        if ( root.left != null ){
            inorderTraversal(root.left);
        }
        //System.out.println(root.val);
        res.add(root.val);
        //System.out.println(res);
        if (root.right != null){
            inorderTraversal(root.right);
        }

        return res;
    }
}
