package easy;

import dataStructures.ListNode;

public class $0021 {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode lister=new ListNode(-1);
        ListNode result=lister;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                lister.next=l2;
                l2=l2.next;
            } else {
                lister.next=l1;
                l1=l1.next;
            }
            lister=lister.next;
        }
        if(l1==null)
            lister.next=l2;
        else lister.next=l1;
        return result.next;
    }
}


