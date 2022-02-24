package solutions;

import dataStructures.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class $0148 {
        public ListNode sortList(ListNode head) {
            List<Integer> vals=getVals(head);
            Collections.sort(vals);
            return getNode(vals);
        }
        List<Integer> getVals(ListNode head){
            List<Integer> vals=new ArrayList<>();
            while(head!=null)
            {
                vals.add(head.val);
                head=head.next;
            }
            return vals;
        }
        ListNode getNode(List<Integer> vals){
            if (vals.size()==0)
                return null;
            ListNode head=new ListNode(vals.get(0));
            ListNode curr=head;
            for(int i=1; i<vals.size(); i++)
            {
                ListNode temp=new ListNode(vals.get(i));
                curr.next=temp;
                curr=temp;
            }
            return head;
        }
    }
