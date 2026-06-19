/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       Map<Node,Node> map=new HashMap<>();
       Node copy=head;
       while(copy!=null){
        map.put(copy,new Node(copy.val));
        copy=copy.next;
       }
       Node res=map.get(head),curr=res;
       while(head!=null){
        curr.next=map.get(head.next);
        curr.random=map.get(head.random);
        curr=curr.next;
        head=head.next;
       }
        return res;  
    }
}