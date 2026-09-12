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
    Map<Integer, Integer> indices;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        indices = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indices.put(inorder[i], i);
        }

        return getTree(0, preorder.length - 1, preorder, 0, inorder.length - 1, inorder);
    }

    private TreeNode getTree(int prestart, int preend, int[] preorder, int instart, int inend, int[] inorder) {

        if (instart > inend)
            return null;

        TreeNode root = new TreeNode(preorder[prestart]);

        int mid = indices.get(preorder[prestart]);

        int leftCount = mid - instart;

        root.left = getTree(prestart + 1, prestart + leftCount, preorder, instart, mid - 1, inorder);
        root.right = getTree(prestart + leftCount + 1, preend, preorder, mid + 1, inend, inorder);

        return root;

    }
}