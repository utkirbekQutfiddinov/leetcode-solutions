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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int i: nums){
            set.add(i);
        }

        ListNode dump=new ListNode();
        dump.next=head;
        ListNode slow=dump, fast=head;

        while(fast!=null){
            if(set.contains(fast.val)){
                slow.next=fast.next;
            }else {
                slow=fast;
            }
            fast=slow.next;
        }

        return dump.next;
    }
}