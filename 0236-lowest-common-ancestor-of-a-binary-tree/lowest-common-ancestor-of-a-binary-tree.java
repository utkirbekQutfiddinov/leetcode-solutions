/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    List<TreeNode> lp=new ArrayList<>(), lq=new ArrayList<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        izla(root, p, lp);
        izla(root, q, lq);


        int l=lp.size()>lq.size()?lq.size():lp.size();

        TreeNode res=root;

        for(int i=0; i<l; i++){
            if(lp.get(lp.size()-1-i).val==lq.get(lq.size()-1-i).val){
                res=lp.get(lp.size()-1-i);
            }else {
                break;
            }
        }


        return res;
    }

    private boolean izla(TreeNode root, TreeNode node, List<TreeNode> list){
        if(root==null){
            return false;
        }

        if(root.val==node.val){
            list.add(node);
            return true;
        }

        boolean chap=izla(root.left, node, list);

        if(chap){
            list.add(root);
            return true;
        }

        boolean ong=izla(root.right, node, list);

        if(ong){
            list.add(root);
            return true;
        }

        return false;
    }
}