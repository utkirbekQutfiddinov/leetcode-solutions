package medium;

import dataStructures.TreeNode;

import java.util.Objects;

public class $1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode l=null, r=null;
        if(Objects.nonNull(original.left)){
            l=getTargetCopy(original.left,cloned.left,target);
        }
        if(Objects.nonNull(original.right)){
            r=getTargetCopy(original.right,cloned.right,target);
        }
        if(original.val==target.val) return cloned;
        else if(Objects.nonNull(l)) return l;
        else if(Objects.nonNull(r)) return r;
        else return null;
    }
}
