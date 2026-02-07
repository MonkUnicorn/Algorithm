
class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

public class BST {
    
    Node insert (Node root, int val) {

        if (root == null) {
            return root = new Node(val);
        }
        if (root.data > val) {
            root.left = insert (root.left, val);
        }
        else {
            root.right = insert (root.right, val);
        }
        return root;
    }

    void inorder (Node root) { // To check if binary search tree is properly created - Elements - Sorted order - Increasing

        if (root != null) {
            inorder(root.left);
            System.out.println(root.data + " -> ");
            inorder(root.right);
        }
    }
}
