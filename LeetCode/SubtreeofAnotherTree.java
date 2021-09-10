package udemy.LeetCode;

public class SubtreeofAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null){
            return true;
        }

        else if (root == null)
            return false;

            /* Check the tree with root as current node */
        else if (isSameTree(root, subRoot))
            return true;

        /* If the tree with root as current node doesn't match then
           try left and right subtrees one by one */
        else{
            return isSubtree(root.left, subRoot)
                    || isSubtree(root.right, subRoot);
        }

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        /* base cases */
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        /* Check if the data of both roots is same and data of left and right
           subtrees are also same */
        return (p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right));


        // if ( p == null || q ==null ){
        //     return p == null && q == null;
        // }else if (p.val == q.val){
        //     return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        // }else{
        //     return false;
        // }
    }
}
