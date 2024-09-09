/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int res=0;
        if(root.children==null){
            return 1;
        }
        
        for(int i=0; i<root.children.size(); i++){
            res=Math.max(res, maxDepth(root.children.get(i)));
        }
        
        return res+1;
    }
}