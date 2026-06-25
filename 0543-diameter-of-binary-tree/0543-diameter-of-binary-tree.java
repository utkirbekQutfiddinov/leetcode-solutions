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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int res=getMaxLen(root.left)+getMaxLen(root.right);
        res=Math.max(res,diameterOfBinaryTree(root.left));
        res=Math.max(res,diameterOfBinaryTree(root.right));
        return res;
    }

    private int getMaxLen(TreeNode root){
        if(root==null) return 0;
        return Math.max(getMaxLen(root.left),getMaxLen(root.right))+1;
    }
}