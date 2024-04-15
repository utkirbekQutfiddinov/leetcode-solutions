class Solution {
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    
    private int sum(TreeNode root, int prev){
        int summ=0;
        
        if(root.left==null && root.right==null) return prev*10+root.val;
        if(root.left!=null) summ+=sum(root.left, prev*10+root.val);
        if(root.right!=null) summ+=sum(root.right, prev*10+root.val);
        return summ;
    }
}