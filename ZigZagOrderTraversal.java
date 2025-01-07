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
    public void helper(TreeNode root,List<List<Integer>> ans,int turn){
        //lets assume even turns same order.
        //odd turns reverse order.

        if(root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer>inner = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){

                TreeNode ele = queue.remove();
                inner.add(ele.val);
                if(ele.left!=null) queue.add(ele.left);
                if(ele.right!=null) queue.add(ele.right);

            }
            if(turn == 0){
                ans.add(new ArrayList<>(inner));
                turn = 1;
            }
            else{
                turn = 0;
                Collections.reverse(inner);
                ans.add(new ArrayList<>(inner));
            }

            // flag = 1;
        }


    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        helper(root,ans,0);

        return ans;
    }
}
