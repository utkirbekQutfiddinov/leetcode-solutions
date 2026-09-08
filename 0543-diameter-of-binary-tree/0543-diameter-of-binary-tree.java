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
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return res;
    }

    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int r=0, l=0;
        if(root.right!=null) r=height(root.right);
        if(root.left!=null) l=height(root.left);
        res=Math.max(res,r+l);
        return Math.max(r,l)+1; 
    }
}