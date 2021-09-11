package udemy.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new LinkedList<>();

        return dfs(root1, res1) == dfs(root2 , res2 );
    }

    private List<Integer> dfs(TreeNode root, List<Integer> res){
        if ( root == null) return res;

        if ( root.left == null){
            res.add(root.left.val);
        }else{
            dfs(root.left,res);
        }
        if(root.right == null) {
            res.add(root.right.val);
        }else{
            dfs(root.right ,res);
        }
        return res;
    }
}
