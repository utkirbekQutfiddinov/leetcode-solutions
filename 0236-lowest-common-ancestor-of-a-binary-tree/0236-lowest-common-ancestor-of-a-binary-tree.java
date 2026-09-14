class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        if(left!=null){
            return left;
        }

        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(right!=null){
            return right;
        }

        if(isChild(root,p) && isChild(root,q)){
            return root;
        }

        return null;
        
    }

    private boolean isChild(TreeNode root, TreeNode child){
        if(root==null) return false;
        if(root.val==child.val) return true;
        return isChild(root.left,child) || isChild(root.right, child);
    }


}