package udemy.BST;

public class Tree {
    private TreeNode root;

    public void insert(int data){
        if ( this.root == null ){
            root = new TreeNode(data);
        }else{
            this.root.insert(data);
        }
    }
    public TreeNode get(int val){
        if ( this.root != null) {
            return root.get(val);
        }
        return null;
    }
    public int min(){
        if (this.root == null){
            return Integer.MIN_VALUE;
        }
        return root.min();
    }
    public int max(){
        if (this.root == null){
            return Integer.MAX_VALUE;
        }
        return root.max();
    }

    public void Traverse(){
        if ( this.root != null){
            this.root.TraverseInOrder();
        }
    }

    public void delete(int val){
        root  = delete(root, val);
    }

    private TreeNode delete(TreeNode subTreeRoot, int val){
        //
        if (subTreeRoot == null)return subTreeRoot;

        if ( val < subTreeRoot.getData()){
            subTreeRoot.setLeft(delete(subTreeRoot.getLeft(), val));
        }else if ( val > subTreeRoot.getData()){
            subTreeRoot.setRight(delete(subTreeRoot.getRight(), val));
        }else{
            //delete 0 or 1 child node
            if( subTreeRoot.getLeft() == null){
                return subTreeRoot.getRight();
            }else if  ( subTreeRoot.getRight() == null){
                return subTreeRoot.getLeft();
            }
            //delete 2 children node
            else{
                //Right child : get the min value of the left
                //Left child: get the max val of the right
                //replace the value in subtreenode with smallest val. from right n delete the min
                subTreeRoot.setData(subTreeRoot.getRight().min());
                subTreeRoot.setRight(delete(subTreeRoot.getRight(),subTreeRoot.getData()));
            }
        }
        return subTreeRoot;
    }
}
