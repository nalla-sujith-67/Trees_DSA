/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxi = 0;
    public int helper(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(helper(root.left),0);              //here is the catch if there is any negative paths in the path then return 0 so that it wont affect the maximum
        int right = Math.max(helper(root.right),0);

        maxi = Math.max(maxi,left+right);                          //this is to calculate the maximum 

        return 1+Math.max(left,right);                            //this is to make sure that the above nodes will also get the maximum paths only.
    }
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return maxi;
    }
}
