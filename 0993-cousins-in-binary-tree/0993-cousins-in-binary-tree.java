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
    public boolean isCousins(TreeNode root, int x, int y) {
        Info ix=getInfo(root, root, x);
        Info iy=getInfo(root, root, y);
        return ix!=null && iy!=null && ix.parent!=iy.parent && ix.depth==iy.depth;
    }

    private Info getInfo(TreeNode parent, TreeNode node, int val){
        if(node==null) return null;
        if(node.val==val){
            return new Info(1, parent.val);
        }

        Info left=getInfo(node, node.left, val);
        if(left!=null){
            return new Info(left.depth+1, left.parent);
        }
        Info right=getInfo(node, node.right, val);
        if(right!=null){
            return new Info(right.depth+1, right.parent);
        }
        return null;
    }
}

class Info{
    int depth;
    int parent;

    public Info(int dep, int par){
        depth=dep;
        parent=par;
    }
}