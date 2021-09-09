package udemy.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList();
        if (root == null )return results;
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> result = new ArrayList<>();
            for (int i =0 ;i < size ;i++){
                TreeNode curr = q.poll();
                result.add(curr.val);
                if (curr.left != null){
                    q.add(curr.left);
                }
                if (curr.right != null){
                    q.add(curr.right);
                }
            }

            results.add(result);
        }
        return results;
    }
}
