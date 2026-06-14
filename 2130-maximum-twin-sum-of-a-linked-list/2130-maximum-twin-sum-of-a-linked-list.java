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
    public int pairSum(ListNode head) {
        int size=0;
        ListNode h1=head;
        while(h1!=null){
            size++;
            h1=h1.next;
        }
        int[] vals=new int[size+1];
        h1=head;
        for(int i=0; i<vals.length && h1!=null; i++, h1=h1.next){
            vals[i]=h1.val;
        }

        int res=vals[0]+vals[size-1];
        for(int i=0; i<vals.length/2; i++){
            if(vals[i]+vals[size-1-i]>res){
                res=vals[i]+vals[size-1-i];
            }
        }
        return res;
    }
}