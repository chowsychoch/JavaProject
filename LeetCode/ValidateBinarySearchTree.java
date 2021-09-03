package udemy.LeetCode;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        if (root == null) return false;

        int parentVal = root.val;
        return helperfunc(root, parentVal);

        //store parent node value
        //left child case
        // compare parent node > left child node
        // right child case
        // compare parent node < right child node
    }

    private boolean helperfunc(TreeNode root, int parentVal) {
        if (root == null) return false;
        if (root.left != null) {
            if (parentVal < root.left.val) {
                //pass
                parentVal = root.left.val;
                helperfunc(root.left, parentVal);
            } else {
                //fail case
                return false;
            }
        }

        //right child
        System.out.println("right val is " + root.right.val);
        System.out.println("parent val is " + parentVal);
        if (root.right != null) {
            if (parentVal < root.right.val) {
                //
                parentVal = root.right.val;
                helperfunc(root.right, parentVal);
            } else {
                return false;
            }
        }

        return true;
    }

    //iterative approach
    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        double left_child = -Double.MAX_VALUE;

        while (!s.isEmpty() || root != null) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.pop();
            System.out.println("left_child" + left_child);
            System.out.println("root val" + root.val);

            if (root.val <= left_child) return false;
            //System.out.println("left_child" + left_child);
            left_child = root.val;

            root = root.right;

        }

        return true;
    }

    public boolean isValidBST3(TreeNode root) {
        return validate(root, null,null);
    }

    public boolean validate(TreeNode root, Integer max, Integer min) {
        if (root == null) return true;

        else if (max != null && root.val > max || min != null && root.val < min) {
            return false;
        } else {
            return validate(root.left, root.val, max) && validate(root.right, min, root.val);
        }
    }
}