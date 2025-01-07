//a tree is said to be a balanced treeif the height of the left subtree and the right subtree is not more that 1.

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


public class BalancedBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(4);
        root.right.left = new Node(8);
        root.right.left.right = new Node(12);
        
        if(isbalanced(root) == -1){
            System.out.println("Not balanced!");
        }
        else{
            System.out.println("balanced!");
        }
    }

    public static int isbalanced(Node root){

        // if(root == null) return true; // if there is no node then return true.

        if(root == null) return 0;

        int left = isbalanced(root.left);
        int right = isbalanced(root.right);

        if(left==-1 || right == -1) return -1;

        if(Math.abs(left-right)>1) return -1;

        return Math.max(left,right)+1;
    }
}
