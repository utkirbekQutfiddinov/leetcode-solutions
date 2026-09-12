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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        if(root.left==null) return root.right==null;
        
        List<TreeNode> list=new ArrayList<>(), list1=new ArrayList<>();
        list.add(root);

        int size=0;
        while(!list.isEmpty()){
            list1=new ArrayList();
            size=list.size();
            for(int i=0; i<size; i++){
                TreeNode node=list.get(i);
                if(node==null) continue;

                list1.add(node.left);
                list1.add(node.right);
            }

            for(int i=0; i<size/2; i++){
                TreeNode left=list.get(i);
                TreeNode right=list.get(size-i-1);

                if(left==null && right==null) continue;
                if(left==null && right!=null || right==null && left!=null) return false; 

                if(left.val!=right.val) return false;
            }
            list=list1;
        }
        return true;
    }
}