package udemy.BST;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public void insert(int value){
        if ( this.data == value){
            return;
        }

        if ( this.data > value){
            if ( this.left == null){
                left = new TreeNode(value);
            }else{
                left.insert(value);
            }
        }else{
            if ( this.right == null){
                right = new TreeNode(value);
            }else{
                right.insert(value);
            }
        }
    }

    public TreeNode get(int val){
        if (data == val )return this;

        if (data > val){
            if ( left != null){
                return left.get(val);
            }
        }else{
            if ( right !=null){
                return right.get(val);
            }
        }
        return null;
    }
    public int min(){
        if ( left == null)return data;
        else{
            return left.min();
        }
    }

    public int max(){
        if(right == null)return data;
        else{
            return right.max();
        }
    }

    public void traverseInOrder2() {
        if (this.left != null) {
            this.left.traverseInOrder2();
        }

        System.out.print(this.data + ", ");
        if (this.right != null) {
            this.right.traverseInOrder2();
        }

    }
    public void TraverseInOrder(){
        //int level = 0 ;
        if ( left != null){
            //level++;
            left.TraverseInOrder();
        }
        //System.out.println("level " + level);
        System.out.print(data + ", ");

        if ( right != null){
            //System.out.println("Right loop ");
            right.TraverseInOrder();
        }


    }

    public void traverseInOrder() {
        if (this.left != null) {
            this.left.traverseInOrder();
        }

        System.out.print(this.data + ", ");
        if (this.right != null) {
            this.right.traverseInOrder();
        }

    }

    public TreeNode(int data){
        this.data = data;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }


    public int getData(){
        return data;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }
}
