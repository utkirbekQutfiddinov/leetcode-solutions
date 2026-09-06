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
    public List<Integer> preorderTraversal(TreeNode root) {
        //root, left, right
        List<Integer> list=new ArrayList<>();
        preorder(root,list); 
        return list;
    }

    private void preorder(TreeNode node, List<Integer> list){
        if(node==null) return;
        list.add(node.val);
        if(node.left!=null) preorder(node.left, list);
        if(node.right!=null) preorder(node.right, list);
    }
}