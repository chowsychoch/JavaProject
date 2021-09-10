package udemy.LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //BFS
        LinkedList<List<Integer>> results = new LinkedList<>();
        if (root == null ) return results;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()){
            int loop = q.size();
            LinkedList<Integer> res = new LinkedList<>();
            for ( int i = 0; i < loop ; i++){
                //take the node out of queue;
                TreeNode curr = q.poll();
                //add the node into result
                res.add(curr.val);
                if ( curr.left != null){
                    q.add(curr.left);
                }

                if (curr.right != null){
                    q.add(curr.right);
                }
            }
            results.addFirst(res);
        }
        return results;
    }
}
