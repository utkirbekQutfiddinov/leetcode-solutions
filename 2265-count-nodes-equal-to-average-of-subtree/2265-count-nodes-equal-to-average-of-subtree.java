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
    int res;
    public int averageOfSubtree(TreeNode root) {
        res=0;
        if(root==null) return res;
        dfs(root);
        return res;
    }

    private Avg dfs(TreeNode root){
        int count=1, sum=root.val;
        if(root.left!=null) {
            Avg left=dfs(root.left);
            count+=left.count();
            sum+=left.sum();
        }
        if(root.right!=null) {
            Avg right=dfs(root.right);
            count+=right.count();
            sum+=right.sum();
        }
        if(root.val==sum/count) {
            res++;
        }
        return new Avg(count,sum);
    }
}

record Avg(int count, int sum){}