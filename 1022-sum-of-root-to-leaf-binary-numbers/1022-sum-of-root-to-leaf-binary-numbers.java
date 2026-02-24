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
    public int sumRootToLeaf(TreeNode root) {
        List<Integer> nodes=getleaves(root);
        
        int sum=0; 
        
        for(Integer i: nodes){
            sum+=i;
        }
        
        return sum;
        
    }
    
    private List<Integer> getleaves(TreeNode root){
        if(root==null) {
            return Collections.emptyList();
        } 
        
        List<Integer> list=new ArrayList<>();
        
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        
        if(root.left!=null){
            root.left.val=root.val*2+root.left.val;
            list.addAll(getleaves(root.left));
        }
        
        if(root.right!=null){
            root.right.val=root.val*2+root.right.val;
            list.addAll(getleaves(root.right));
        }
        
        return list;
        
        
    }

}