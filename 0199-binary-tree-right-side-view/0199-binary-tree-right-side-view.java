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
    public List<Integer> rightSideView(TreeNode root) {
        
        if(root==null) return List.of();

        Queue<TreeNode> que=new ArrayDeque<>();
        List<Integer> res=new ArrayList<>();
        
        TreeNode curr=null;

        que.add(root);

        while(!que.isEmpty()){
            int size=que.size();

            for(int i=0; i<size; i++){
                curr=que.poll();
                if(curr.left!=null) que.add(curr.left);
                if(curr.right!=null) que.add(curr.right);
            }
            res.add(curr.val);
        }
        return res;
    }
}