/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len=0;

        ListNode node=head;
        while(node!=null){
            len++;
            node=node.next;
        }
        
        ListNode[] res=new ListNode[k];
        int each=len/k;//3
        int add=len%k;//2

        for(int i=0; i<add; i++){
            for(int j=0; j<each+1; j++){
                if(j==0){
                    node=new ListNode(head.val);
                    res[i]=node;
                    head=head.next;
                }else {
                    node.next=new ListNode(head.val);
                    node=node.next;
                    head=head.next;
                }
            }
        }

        for(int i=add; i<k; i++){
            for(int j=0; j<each; j++){
                if(j==0){
                    node=new ListNode(head.val);
                    res[i]=node;
                    head=head.next;
                }else {
                    node.next=new ListNode(head.val);
                    node=node.next;
                    head=head.next;
                }
            }
        }
        return res;
    }
}