import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Node 
{
    int data;
    Node left;
    Node right;

    Node (int x) 
    {
        data = x;
        left = null;
        right = null;
    }
}

class BinaryTree 
{
    Node root = null;

    void preorder (Node root) 
    {
        if(root != null)
        {
            System.out.print(root.data + " -> ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void inorder(Node root) 
    {
        if(root != null) 
        {
            inorder(root.left);
            System.out.print(root.data + " -> ");
            inorder(root.right);
        }
    }

    void postorder(Node root)
    {
        if(root != null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " -> ");
        }
    }

    void levelorder(Node root)
    {

        if (root == null)
        {
            System.out.println("Tree is Empty");
            return;
        }

        Queue<Node> q = new LinkedList<>();

        // q.add(null);

        q.add(root);

        while(!q.isEmpty())
        {
            Node temp = q.poll();

            // if(temp == null) {
            //     q.add(temp);
            //     continue;
            // }

            System.out.print(temp.data + " -> ");
            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null) {
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        
        Node root = new Node (10);
        root.left = new Node (15);
        root.left.left = new Node (20);

        root.right = new Node (25);
        root.right.left = new Node(30);
        root.right.right = new Node (8);

        BinaryTree btObj = new BinaryTree();

        btObj.preorder(root);
        System.out.println();
        btObj.inorder(root);
        System.out.println();
        btObj.postorder(root);
        System.out.println();
        btObj.levelorder(root);

    }
}