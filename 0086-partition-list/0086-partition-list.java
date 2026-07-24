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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(0), less=dummy;
        ListNode dummy1=new ListNode(0), greater=dummy1;

        while(head!=null){
            if(head.val<x){
                less.next=new ListNode(head.val);
                less=less.next;
            }

            if(head.val>=x){
                greater.next=new ListNode(head.val);
                greater=greater.next;
            }

            head=head.next;
        }

        less.next=dummy1.next;
        return dummy.next;
    }
}