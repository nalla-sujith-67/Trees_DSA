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

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(4);
        root.right.left = new Node(8);
        root.right.left.right = new Node(12);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        bfs(root, arr);

        System.out.println("Level Order Traversal:");
        for (ArrayList<Integer> level : arr) {
            System.out.println(level);
        }
    }

    public static void bfs(Node root, ArrayList<ArrayList<Integer>> ans) {
        if (root == null) return; // Base condition if tree is empty

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            ArrayList<Integer> inner = new ArrayList<>();

            for (int i = 0; i < queueSize; i++) {
                Node ele = queue.remove();
                inner.add(ele.data);

                // Add child nodes to the queue
                if (ele.left != null) queue.add(ele.left);
                if (ele.right != null) queue.add(ele.right);
            }

            ans.add(inner); 
        }
    }
}
