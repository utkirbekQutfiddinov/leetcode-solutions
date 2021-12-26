package easy;

import dataStructures.TreeNode;

import java.util.Objects;

public class $0938 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int res=0;
        if(root.val<=high&&root.val>=low)res=res+root.val;
        if(Objects.nonNull(root.left)){
            res+=rangeSumBST(root.left,low,high);
        }

        if(Objects.nonNull(root.right)){
            res+=rangeSumBST(root.right,low,high);
        }
        return res;
    }
}
