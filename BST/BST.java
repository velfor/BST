package BST;

/**
 * Created by velfor on 25.10.2022.
 */
class Node<T>{
    T data;
    Node<T> left, right;

    Node(T data) {     this.data = data;   }
}

public class BST <T extends Comparable<T>> implements BinaryTree<T>{

    private Node<T> root;

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> root, T data)
    {
        if (root == null){
            return new Node<T>(data);
        }
        else if (data.compareTo(root.data) < 0){
            root.left = insert(root.left, data);
        }
        else if (data.compareTo(root.data) > 0){
            root.right = insert(root.right, data);
        }
        else{

        }
        return root;
    }

    @Override
    public void delete() {

    }

    @Override
    public boolean contains(T data) {
        return false;
    }
}
