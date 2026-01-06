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
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> nums=new LinkedList<>();

        nums.add(root);

        long currSum=0, maxSum=Long.MIN_VALUE;
        int levelSize=nums.size(), maxLevel=0, currLevel=0;
        TreeNode currNode=null;

        while(levelSize>0){
            currSum=0;
            currLevel++;
            for(int i=0; i<levelSize; i++){
                currNode=nums.poll();
                currSum+=currNode.val;

                if(currNode.left!=null)
                nums.add(currNode.left);

                if(currNode.right!=null)
                nums.add(currNode.right);
            }
            if(currSum>maxSum){
                maxSum=currSum;
                maxLevel=currLevel;
            }
            levelSize=nums.size();
        }


        return maxLevel;
    }
}