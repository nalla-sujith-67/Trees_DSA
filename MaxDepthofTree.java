import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class MaxDepth {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(4);
        root.right.left = new Node(8);
        root.right.left.right = new Node(12);

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(Node root){

        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1+Math.max(left,right);
    }
}
