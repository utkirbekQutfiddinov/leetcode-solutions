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
    public int sumNumbers(TreeNode root) {
        int sum=0;
        List<Integer> nums=getChildren(root);
        for(int i=0; i<nums.size();i++){
            sum+=nums.get(i);
        }

        return sum;

    }



    private List<Integer> getChildren(TreeNode root){

        if(root==null){
            return Collections.emptyList();
        }

        List<Integer> list=new ArrayList<>();

        if(root.left==null && root.right==null){
            list.add(root.val);
        }

        if(root.left!=null){
            root.left.val+=root.val*10;
            list.addAll(getChildren(root.left));
        }
        if(root.right!=null){
            root.right.val+=root.val*10;
            list.addAll(getChildren(root.right));
        }

        return list;

    }
}