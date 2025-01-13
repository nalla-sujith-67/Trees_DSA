// the aim of this problem is to find if the parent follows the children sum property if yes return true else return false
 *****************************************************************/
public class Solution {
    public static boolean isParentSum(Node root) {
        // Write your code here.
        if(root == null) return true;

        if(root.left == null && root.right == null) return true;

        int sum = 0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;

        if(sum != root.data) return false;

        boolean left = isParentSum(root.left);
        boolean right = isParentSum(root.right);

        if(!left || !right) return false;
        return true;

    }
}
