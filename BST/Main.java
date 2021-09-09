package udemy.BST;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.Traverse();
        TreeNode ans = intTree.get(32);
        System.out.println(ans.data);
        System.out.println(intTree.min());
        System.out.println(intTree.max());
        intTree.delete(25);
        intTree.Traverse();
        System.out.println();
        intTree.delete(32);
        intTree.Traverse();

    }
}
