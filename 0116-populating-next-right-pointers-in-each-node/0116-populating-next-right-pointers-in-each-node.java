/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root; 
        List<Node> que=new LinkedList<>();
        que.add(root);

        int len=0;
        Node prev=null, curr=null;
        while(!que.isEmpty()){
            len=que.size();
            for(int i=0; i<len; i++){
                curr=que.remove(0);
                
                if(curr.left!=null) que.add(curr.left);
                if(curr.right!=null) que.add(curr.right);

                if(prev!=null){
                    prev.next=curr;
                }

                prev=curr;
            }
            prev=null;
        }
        return root;
    }
}