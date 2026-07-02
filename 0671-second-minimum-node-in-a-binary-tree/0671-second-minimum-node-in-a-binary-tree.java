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
    Set<Integer> vals=new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
       traverse(root);
       Integer minn=null;
       for(Integer val: vals){
        if(val==root.val){
            continue;
        }
        if(minn==null){
            minn=val;
            continue;
        }

        if(val<minn){
            minn=val;
        }
       }

        return minn==null?-1:minn;
    }

    private void traverse(TreeNode node){
        if(node==null) return;
        vals.add(node.val);
        traverse(node.left);
        traverse(node.right);
    }
}