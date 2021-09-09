package udemy.LeetCode;


public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null)return true;
        if (root.left == null || root.right == null)return false;
        return helperfunc(root.left, root.right);
    }

    private boolean helperfunc(TreeNode leftChild, TreeNode rightChild){
        if ( leftChild == null && rightChild == null)return true;
        if (leftChild == null || rightChild == null || leftChild.val != rightChild.val)return false;
        return helperfunc(leftChild.left, rightChild.right) && helperfunc(leftChild.right, rightChild.left);
    }
}
