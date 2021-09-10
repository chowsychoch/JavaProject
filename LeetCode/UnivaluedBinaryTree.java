package udemy.LeetCode;

public class UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null )return false;
        return helperFunc(root , root.val);
    }

    private boolean helperFunc(TreeNode root, int val){
        if ( root.val == val){
            return helperFunc(root.left, val)
            && helperFunc(root.right, val);
        }
        return false;
    }

    public boolean isUnivalTree1(TreeNode root){
        if ( root == null)return true;

        if (root.left !=null){
            if(root.val != root.left.val){
                return false;
            }
        }

        if (root.right != null){
            if(root.val != root.right.val){
                return false;
            }
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
