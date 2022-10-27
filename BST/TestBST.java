package BST;

public class TestBST {
    public static void main(String[] args) {
        BST t = new BST();
        t.add(5);
        t.add(1);
        t.add(8);
        t.inorder(t.getRoot());
    }
}
