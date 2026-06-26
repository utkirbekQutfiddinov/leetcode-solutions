/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.right!=null && isAncestor(root.right,p) && isAncestor(root.right,q)) return lowestCommonAncestor(root.right,p,q);
        if(root.left!=null && isAncestor(root.left,p) && isAncestor(root.left,q)) return lowestCommonAncestor(root.left,p,q);
        return root;
    }

    private boolean isAncestor(TreeNode node1, TreeNode node2){
        if(node1==null) return false;
        if(node1.val==node2.val) return true;
        return isAncestor(node1.left,node2)||isAncestor(node1.right,node2);
    }
}