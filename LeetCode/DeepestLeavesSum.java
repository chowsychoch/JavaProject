package udemy.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    int total = 0 ;
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = maxDepth(root);
        sum(root,maxDepth, 1 );
        return total;
    }

    // find max depth
    public int maxDepth(TreeNode root){
        if ( root == null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public int maxDepth_2(TreeNode root){
        // Base Case
        if (root == null)
            return 0;

        // Create an empty queue for level order tarversal
        Queue<TreeNode> q = new LinkedList();

        // Enqueue Root and initialize height
        q.add(root);
        int height = 0;

        while (1 == 1)
        {
            // nodeCount (queue size) indicates number of nodes
            // at current level.
            int nodeCount = q.size();
            if (nodeCount == 0)
                return height;
            height++;

            // Dequeue all nodes of current level and Enqueue all
            // nodes of next level
            while (nodeCount > 0)
            {
                TreeNode newnode = q.peek();
                q.remove();
                if (newnode.left != null)
                    q.add(newnode.left);
                if (newnode.right != null)
                    q.add(newnode.right);
                nodeCount--;
            }
        }
    }
    // add sum
    public void sum(TreeNode root, int maxDepth, int curr){
        if ( root == null) return;
        if  ( maxDepth == curr){
            total+= root.val;
        }
        sum(root.left, maxDepth,  1 + curr);
        sum(root.right, maxDepth, 1 + curr);

    }

}
