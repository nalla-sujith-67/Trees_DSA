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

    public void helper(TreeNode root,List<String> ans,List<Integer> inner){
        if(root == null) return;
        inner.add(root.val);


        if(root.left == null && root.right == null){
            StringBuilder str = new StringBuilder();
            for(int i =0;i<inner.size();i++){
                if(i!=inner.size()-1){
                    str.append(inner.get(i)).append("->");
                }
                else{
                    str.append(inner.get(i));
                }
            }

            ans.add(str.toString());
        }
        else{

            helper(root.left,ans,inner);
            helper(root.right,ans,inner);
        }
        inner.remove(inner.size()-1);

    }
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();

        helper(root,ans,inner);

        return ans;
    }
}
