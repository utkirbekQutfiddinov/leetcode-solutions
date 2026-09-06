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
        if(root==null) return List.of();
        List<Integer> list=new ArrayList<>();
        list.add(root.val);
        if(root.left!=null) list.addAll(preorderTraversal(root.left));
        if(root.right!=null) list.addAll(preorderTraversal(root.right)); return list;
    }
}