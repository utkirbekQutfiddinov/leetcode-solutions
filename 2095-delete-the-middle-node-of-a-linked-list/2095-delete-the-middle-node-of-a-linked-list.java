class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            prev = prev.next;
            fast = fast.next.next;
        }
        
        prev.next = prev.next.next;
        return dummy.next;
    }
}