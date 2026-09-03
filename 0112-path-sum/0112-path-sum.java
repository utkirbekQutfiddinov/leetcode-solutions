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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> nodes=new ArrayDeque<>();
        if(root!=null) nodes.add(root);

        int len;
        while(!nodes.isEmpty()){
            len=nodes.size();
            for(int i=0; i<len; i++){
                TreeNode node=nodes.poll();
                if(node.left==null && node.right==null && node.val==targetSum) return true;
                if(node.left!=null){
                    TreeNode left=node.left;
                    left.val+=node.val;
                    nodes.add(left);
                } 
                if(node.right!=null){
                    TreeNode right=node.right;
                    right.val+=node.val;
                    nodes.add(right);
                } 
            }
        }
        return false;

    }
}