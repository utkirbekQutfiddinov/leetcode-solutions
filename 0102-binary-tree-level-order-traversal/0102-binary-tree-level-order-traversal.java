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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> level=null;
        Queue<TreeNode> que=new ArrayDeque<>();
        if(root!=null) que.add(root);
        int queSize;
        TreeNode curr=null;
        while(!que.isEmpty()){
            queSize=que.size();
            level=new ArrayList<>();
                
            for(int i=0; i<queSize; i++){
                curr=que.poll();
                level.add(curr.val);
                if(curr.left!=null) que.add(curr.left);    
                if(curr.right!=null) que.add(curr.right);
            }
            result.add(level);
        }
        return result;
    }
}