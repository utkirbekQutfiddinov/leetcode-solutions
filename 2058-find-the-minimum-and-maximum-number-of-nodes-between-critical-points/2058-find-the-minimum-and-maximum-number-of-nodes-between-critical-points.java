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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null) return new int[]{-1,-1};
        
        List<Integer> indices=new ArrayList<>();
        
        ListNode prev=head;
        if(prev.next==null) return new int[]{-1,-1};
        ListNode curr=prev.next;
        if(curr.next==null) return new int[]{-1,-1};
        ListNode next=curr.next;

        int index=1;

        while(next!=null){
            if(curr.val < prev.val && curr.val < next.val){
                System.out.println(prev.val + ">"+curr.val+"<"+next.val+", index="+index);
                indices.add(index);
            }
            if(curr.val > prev.val && curr.val > next.val){
                System.out.println(prev.val + "<"+curr.val+">"+next.val+", index="+index);
                indices.add(index);
            }
            prev=curr;
            curr=next;
            next=curr.next;
                index++;
        }
        if(indices.size()<2) return new int[]{-1,-1};

        int minDiff=Integer.MAX_VALUE, maxDiff=Integer.MIN_VALUE;
        for(int i=0; i<indices.size()-1; i++){
            minDiff=Math.min(minDiff,indices.get(i+1)-indices.get(i));
        }

        System.out.println(indices);

        return new int[]{minDiff, indices.get(indices.size()-1)-indices.get(0)};
    }
}