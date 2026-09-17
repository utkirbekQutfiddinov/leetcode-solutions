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
        Map<String, TreeNode> map=new HashMap<>();
        Map<String, Integer> freqs=new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);

        List<TreeNode> res=new ArrayList<>();
        for(String hash: freqs.keySet()){
            Integer freq=freqs.get(hash);
            if(freq>1){
                res.add(map.get(hash));
            }
        }

        return res;
    }

    private String dfs(TreeNode node){
        if(node==null) return "_";
        StringBuilder sb=new StringBuilder();
        if(node.left==null) sb.append("L");
        else sb.append(dfs(node.left));

        sb.append(",")
            .append(node.val)
            .append(",");
        if(node.right==null) sb.append("R");
        else sb.append(dfs(node.right));
        String hash=sb.toString();
        map.put(hash, node);
        freqs.merge(hash, 1, Integer::sum);
        return hash;
    }
}