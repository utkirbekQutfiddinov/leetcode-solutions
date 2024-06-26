/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes=new HashSet<>();
        
        while(true){
            if(head==null){
                return false;
            }
            
            if(nodes.contains(head)){
                return true;
            }
            nodes.add(head);
            head=head.next;
        }
    }
}