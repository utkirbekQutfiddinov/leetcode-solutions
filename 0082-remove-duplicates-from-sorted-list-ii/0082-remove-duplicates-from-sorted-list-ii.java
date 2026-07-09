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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> unique=new HashSet<>(), dupl=new HashSet<>();
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy, curr=head;
        
        while(curr!=null){
            if(dupl.contains(curr.val)){
                curr=curr.next;
                continue;
            }
            if(unique.contains(curr.val)){
                unique.remove(curr.val);
                dupl.add(curr.val);
                curr=curr.next;
            }else{
                unique.add(curr.val);
                curr=curr.next;
            }
        }

        curr=head;

        while(curr!=null){
            if(dupl.contains(curr.val)){
                prev.next=curr.next;
                curr=prev.next;
            }else {
                curr=curr.next;
                prev=prev.next;
            }
        }
        
        return dummy.next;
    }
}