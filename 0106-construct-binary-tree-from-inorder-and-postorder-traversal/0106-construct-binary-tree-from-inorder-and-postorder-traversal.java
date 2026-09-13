class Solution {
    
    Map<Integer, Integer> indices;
    int[] in;
    int[] post;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.in=inorder;
        this.post=postorder;

        indices = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indices.put(inorder[i], i);
        }

        return getTree(0, postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode getTree(int poststart, int postend, int instart, int inend){
        if(instart>inend) return null;

        TreeNode root=new TreeNode(post[postend]);
        int mid=indices.get(post[postend]);
        int rightCount=inend-mid;

        root.left=getTree(poststart, postend-rightCount-1, instart, mid-1);
        root.right=getTree(postend-rightCount, postend-1, mid+1, inend);
        return root;
    }

}