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
    List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return List.of();
        result=new ArrayList<>();
        solve(new ArrayList<>(),root,0,targetSum);

        return result;
    }

    private void solve(List<Integer> currList, TreeNode node, int prefixSum, int targetSum){
        List<Integer> cur=new ArrayList<>(currList);
        cur.add(node.val);
            
        if(node.left==null && node.right==null && node.val+prefixSum==targetSum){
            result.add(cur);
            return;
        }

        if(node.left!=null){
            solve(cur, node.left, prefixSum+node.val, targetSum);
        }
        
        if(node.right!=null){
            solve(cur, node.right, prefixSum+node.val, targetSum);
        }
    }
}