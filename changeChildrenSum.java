// the goal of this problem is to make the root such that the root should be equal to the sum of two of it's children
public class Solution {
    public static void changeParentSum(Node root) {
        // Write your code here.

        if(root == null) return;

        int child = 0;

        if(root.left!=null) child+=root.left.data;
        if(root.right!=null) child+=root.right.data;

        if(root.data<=child){
            root.data = child;
        }
        else{
            root.left.data = root.data;
            root.right.data = root.data;
        }

        isParentSum(root.left);
        isParentSum(root.right);

        int returnSum = 0;

        if(root.left!=null) returnSum += root.left.data;
        if(root.right!=null) returnSum += root.right.data;

        if(root.left!=null && root.right!=null) root.val = returnSum;
    }
}
