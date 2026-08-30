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
    public TreeNode sortedArrayToBST(int[] nums) {
        return getTree(nums, 0, nums.length);
    }

    private TreeNode getTree(int[] nums, int left, int right){
        if(left==right){
            return null;
        }else {
            int middle=(right-left)/2+left;
            return new TreeNode(nums[middle], getTree(nums,left, middle), getTree(nums,middle+1,right));
        }
    }
}