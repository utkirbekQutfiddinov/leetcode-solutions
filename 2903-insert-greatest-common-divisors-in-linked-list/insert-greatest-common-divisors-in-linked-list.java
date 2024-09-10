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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       
        ListNode p1=head;
        ListNode p2=head.next;
        ListNode newNode;
        
        while(p2!=null){
            newNode=new ListNode(ekub(p1.val, p2.val));
            p1.next=newNode;
            newNode.next=p2;
            
            p1=p2;
            p2=p2.next;
        }
        
        
      return head;  
        
    }
    
    private int ekub(int a, int b){
        
        int kichik=a>b?b:a;
        
        
        for(int i=kichik; i>=1; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        
        return 1;
    }
}