package udemy.LeetCode;

public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        System.out.println("root. val " +root.val);
        if ( root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }
}
