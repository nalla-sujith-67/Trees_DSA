
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

public class DfsTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(4);
        root.right.left = new Node(8);
        root.right.left.right = new Node(12);

        dfs(root);
    }

    public static void dfs(Node root){
        if(root == null) return;

        System.out.print(root.data+" ");
        dfs(root.left);
        dfs(root.right);
        
    }
}
