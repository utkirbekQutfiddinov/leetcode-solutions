package solutions;

import dataStructures.TreeNode;

import java.util.Objects;

public class $0700 {
    public TreeNode searchBST(TreeNode root, int tar) {
        TreeNode left=new TreeNode(), right=new TreeNode();
        if(Objects.nonNull(root)){
            if(root.val==tar) return root;
            if(Objects.nonNull(root.left))
            {left=searchBST(root.left,tar);
                if(Objects.nonNull(left)&&left.val==tar) return left;}
            if(Objects.nonNull(root.right)){
                right=searchBST(root.right,tar);
                if(Objects.nonNull(right)&&right.val==tar) return right;
            }
        }
        return null;
    }
}
