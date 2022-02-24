package solutions;

import dataStructures.ListNode;

import java.util.Objects;

class $0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=l1.val+l2.val;
        l1=l1.next;
        l2=l2.next;
        ListNode curr=new ListNode(sum%10);
        sum/=10;
        ListNode res=curr,newNode;
        while(Objects.nonNull(l1)||Objects.nonNull(l2)){
            if(Objects.nonNull(l1)) sum+=l1.val;
            if(Objects.nonNull(l2)) sum+=l2.val;
            newNode=new ListNode(sum%10);
            sum/=10;
            curr.next=newNode;
            curr=curr.next;
            if(Objects.nonNull(l1)) l1=l1.next;
            if(Objects.nonNull(l2)) l2=l2.next;
        }
        if(sum>0){
            newNode=new ListNode(sum);
            curr.next=newNode;
        }
        return res;
    }
}

