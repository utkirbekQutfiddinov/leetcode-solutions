package solutions;

import dataStructures.TreeNode;

import java.util.Objects;

public class $0617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode res=new TreeNode();
        if(Objects.isNull(root1)){
            if(Objects.isNull(root2)){
                res=null;
            } else {
                res=root2;
            }
        } else {
            if(Objects.isNull(root2)){
                res=root1;
            }else{
                res.val=root1.val+root2.val;
                res.left=mergeTrees(root1.left,root2.left);
                res.right=mergeTrees(root1.right, root2.right);
            }
        }
        return res;
    }
}

